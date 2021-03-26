package alla.shtokal.dto.salesorder.response;

import alla.shtokal.dto.ResponseStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RootSalesOrderResponse {

    public MvSalesOrder mvSalesOrder;
    @JsonProperty("ResponseStatus")
    public ResponseStatus responseStatus;
    public int entityID;
}
