package alla.shtokal.dto.salesorder.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SalesOrderDetail {
    @JsonProperty("SalesOrderRowDetailID")
    public int salesOrderRowDetailID;
    @JsonProperty("SalesOrderRowProductID")
    public int salesOrderRowProductID;
    @JsonProperty("SalesOrderRowProductSKU")
    public String salesOrderRowProductSKU;
    @JsonProperty("SalesOrderRowQuantity")
    public int salesOrderRowQuantity;
    @JsonProperty("SalesOrderRowShippedQuantity")
    public int salesOrderRowShippedQuantity;
    @JsonProperty("SalesOrderRowInvoicedQuantity")
    public int salesOrderRowInvoicedQuantity;
    @JsonProperty("SalesOrderRowUnitPriceWithoutTaxOrDiscount")
    public double salesOrderRowUnitPriceWithoutTaxOrDiscount;
    @JsonProperty("SalesOrderRowTaxID")
    public int salesOrderRowTaxID;
    @JsonProperty("SalesOrderTotalTaxAmount")
    public int salesOrderTotalTaxAmount;
    @JsonProperty("SalesOrderRowDiscountID")
    public int salesOrderRowDiscountID;
    @JsonProperty("SalesOrderRowTotalDiscountAmount")
    public int salesOrderRowTotalDiscountAmount;
    @JsonProperty("SalesOrderRowTotalAmount")
    public double salesOrderRowTotalAmount;
    @JsonProperty("SalesOrderRowSerialNumbers")
    public List<Object> salesOrderRowSerialNumbers;
    @JsonProperty("SalesOrderRowBatchNumbers")
    public List<Object> salesOrderRowBatchNumbers;
    @JsonProperty("SalesOrderRowRemarks")
    public String salesOrderRowRemarks;
}
