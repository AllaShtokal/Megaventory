package alla.shtokal.dto.product.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RootProductResponse {

    public MvProductResponse mvProductResponse;
    @JsonProperty("ResponseStatus")
    public ResponseStatus responseStatus;
    public int entityID;
}
