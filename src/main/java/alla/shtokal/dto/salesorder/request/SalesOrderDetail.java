package alla.shtokal.dto.salesorder.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SalesOrderDetail {

    @JsonProperty("SalesOrderRowProductSKU")
    public String salesOrderRowProductSKU;
    @JsonProperty("SalesOrderRowQuantity")
    public String salesOrderRowQuantity;
    @JsonProperty("SalesOrderRowShippedQuantity")
    public String salesOrderRowShippedQuantity;
    @JsonProperty("SalesOrderRowInvoicedQuantity")
    public String salesOrderRowInvoicedQuantity;
    @JsonProperty("SalesOrderRowUnitPriceWithoutTaxOrDiscount")
    public String salesOrderRowUnitPriceWithoutTaxOrDiscount;
}
