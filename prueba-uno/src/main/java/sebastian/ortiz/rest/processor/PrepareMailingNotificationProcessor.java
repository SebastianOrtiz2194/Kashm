package sebastian.ortiz.rest.processor;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Assert Solutions S.A.S <info@assertsolutions.com>
 * <br/>
 * Date: 10/04/2018 9:04:30 a.m.
 *
 */
@Component("prepareMailingNotificationProcessor")
public class PrepareMailingNotificationProcessor implements Processor {
    
    @Override
    public void process(Exchange exchange) throws Exception {
	Map<String, Object> map = new HashMap<>();
	// set required fields
	map.put("from", String.valueOf(exchange.getProperty("mailFrom")));
	map.put("to", String.valueOf(exchange.getProperty("mailTo")));
	map.put("subject", String.valueOf(exchange.getProperty("mailSubject")));
	map.put("template", String.valueOf(exchange.getProperty("mailTemplate")));
	
	// set optional fields
	map.put("NombreServicio", String.valueOf(exchange.getIn().getHeader("NombreServicio")));
	map.put("TipoServicio", String.valueOf(exchange.getIn().getHeader("TipoServicio")));
	map.put("DescripcionError", String.valueOf(exchange.getIn().getHeader("DescripcionError")));
	
	exchange.getIn().setBody(map, Map.class);
    }
    
}
