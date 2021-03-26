package alla.shtokal.dto.warehouse.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RootWarehouseRequest {
    public MvInventoryLocation mvInventoryLocation;
    public String mvRecordAction;
    @JsonProperty("APIKEY")
    public String APIKEY;
}
