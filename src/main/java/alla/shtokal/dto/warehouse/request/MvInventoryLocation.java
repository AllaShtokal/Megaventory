package alla.shtokal.dto.warehouse.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
//request
@Data
public class MvInventoryLocation {
    @JsonProperty("InventoryLocationName")
    public String inventoryLocationName;
    @JsonProperty("InventoryLocationAbbreviation")
    public String inventoryLocationAbbreviation;
}
