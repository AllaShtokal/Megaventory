package alla.shtokal.dto.salesorder.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class MvSalesOrder {

    @JsonProperty("SalesOrderClientId")
    public int salesOrderClientId;
    @JsonProperty("SalesOrderTypeId")
    public int salesOrderTypeId;
    @JsonProperty("SalesOrderInventoryLocationID")
    public int SalesOrderInventoryLocationID;
    @JsonProperty("SalesOrderStatus")
    public String salesOrderStatus;
    @JsonProperty("SalesOrderDetails")
    public List<SalesOrderDetail> salesOrderDetails;
}
