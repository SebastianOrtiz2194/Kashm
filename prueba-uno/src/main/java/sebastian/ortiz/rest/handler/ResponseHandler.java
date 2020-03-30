package sebastian.ortiz.rest.handler;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

import sebastian.ortiz.rest.dto.ResponseDTO;

/**
 * 
 * @author Assert Solutions S.A.S <info@assertsolutions.com>
 *         <br/>
 *         Date: 9/04/2018 8:11:28 a.m.
 *
 */
@Component
public class ResponseHandler {

    @Handler
    public Response createResponse() {
	// Create Entity for Response
	ResponseDTO responseDTO = new ResponseDTO();

	return Response.status(Status.ACCEPTED).entity(responseDTO).build();
    }
}
