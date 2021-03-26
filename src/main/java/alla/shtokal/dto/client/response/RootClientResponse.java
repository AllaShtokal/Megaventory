package alla.shtokal.dto.client.response;

import alla.shtokal.dto.ResponseStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RootClientResponse {

    public MvSupplierClient mvSupplierClient;
    @JsonProperty("ResponseStatus")
    public ResponseStatus responseStatus;
    public int entityID;

}
