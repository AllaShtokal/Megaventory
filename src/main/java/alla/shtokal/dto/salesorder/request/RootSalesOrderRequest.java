package alla.shtokal.dto.salesorder.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RootSalesOrderRequest {

    public MvSalesOrder mvSalesOrder;
    public String mvRecordAction;
    @JsonProperty("APIKEY")
    public String APIKEY;
}
