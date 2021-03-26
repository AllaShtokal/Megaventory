package alla.shtokal.dto.warehouse.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MvInventoryLocation {
    @JsonProperty("InventoryLocationID")
    public int inventoryLocationID;
    @JsonProperty("InventoryLocationName")
    public String inventoryLocationName;
    @JsonProperty("InventoryLocationAbbreviation")
    public String inventoryLocationAbbreviation;
}
