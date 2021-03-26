package alla.shtokal.dto.warehouse.response;

import alla.shtokal.dto.ResponseStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RootWarehouseResponse {
    public MvInventoryLocation mvInventoryLocation;
    @JsonProperty("ResponseStatus")
    public ResponseStatus responseStatus;
    public int entityID;
}
