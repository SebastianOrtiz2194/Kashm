package sebastian.ortiz.rest.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonAutoDetect
@JsonSerialize
public class ResponseDTO implements Serializable {

    private static final long serialVersionUID = -928421079621243775L;
    @JsonProperty
    private String field1;
    @JsonProperty
    private String field2;
    @JsonProperty
    private String field3;

    public ResponseDTO() {
    }

    public String getField1() {
	return this.field1;
    }

    public void setField1(String field1) {
	this.field1 = field1;
    }

    public String getField2() {
	return this.field2;
    }

    public void setField2(String field2) {
	this.field2 = field2;
    }

    public String getField3() {
	return this.field3;
    }

    public void setField3(String field3) {
	this.field3 = field3;
    }
}
