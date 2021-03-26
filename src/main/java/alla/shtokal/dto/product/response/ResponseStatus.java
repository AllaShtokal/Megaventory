package alla.shtokal.dto.product.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResponseStatus {
    @JsonProperty("ErrorCode")
    public String errorCode;
}
