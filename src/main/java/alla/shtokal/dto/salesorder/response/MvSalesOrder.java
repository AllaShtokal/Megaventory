package alla.shtokal.dto.salesorder.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class MvSalesOrder {
    @JsonProperty("SalesOrderId")
    public int salesOrderId;
    @JsonProperty("SalesOrderTypeId")
    public int salesOrderTypeId;
    @JsonProperty("SalesOrderTypeAbbreviation")
    public String salesOrderTypeAbbreviation;
    @JsonProperty("SalesOrderTypeDescription")
    public String salesOrderTypeDescription;
    @JsonProperty("SalesOrderNo")
    public String salesOrderNo;
    @JsonProperty("SalesOrderReferenceNo")
    public String salesOrderReferenceNo;
    @JsonProperty("SalesOrderReferenceApplication")
    public String salesOrderReferenceApplication;
    @JsonProperty("SalesOrderDate")
    public String salesOrderDate;
    @JsonProperty("SalesOrderCustomOrderDate1")
    public String salesOrderCustomOrderDate1;
    @JsonProperty("SalesOrderCustomOrderDate2")
    public String salesOrderCustomOrderDate2;
    @JsonProperty("SalesOrderCurrencyCode")
    public String salesOrderCurrencyCode;
    @JsonProperty("SalesOrderClientID")
    public int salesOrderClientID;
    @JsonProperty("SalesOrderBillingAddress")
    public String salesOrderBillingAddress;
    @JsonProperty("SalesOrderShippingAddress")
    public String salesOrderShippingAddress;
    @JsonProperty("SalesOrderContactPerson")
    public String salesOrderContactPerson;
    @JsonProperty("SalesOrderInventoryLocationID")
    public int salesOrderInventoryLocationID;
    @JsonProperty("SalesOrderCustomFlag1")
    public boolean salesOrderCustomFlag1;
    @JsonProperty("SalesOrderCustomFlag2")
    public boolean salesOrderCustomFlag2;
    @JsonProperty("SalesOrderCustomFlag3")
    public boolean salesOrderCustomFlag3;
    @JsonProperty("SalesOrderCustomFlag4")
    public boolean salesOrderCustomFlag4;
    @JsonProperty("SalesOrderCustomFlag5")
    public boolean salesOrderCustomFlag5;
    @JsonProperty("SalesOrderCustomFlag6")
    public boolean salesOrderCustomFlag6;
    @JsonProperty("SalesOrderCustomFlag7")
    public boolean salesOrderCustomFlag7;
    @JsonProperty("SalesOrderCustomFlag8")
    public boolean salesOrderCustomFlag8;
    @JsonProperty("SalesOrderCustomFlag9")
    public boolean salesOrderCustomFlag9;
    @JsonProperty("SalesOrderCustomFlag10")
    public boolean salesOrderCustomFlag10;
    @JsonProperty("SalesOrderComments")
    public String salesOrderComments;
    @JsonProperty("SalesOrderTags")
    public String salesOrderTags;
    @JsonProperty("SalesOrderPaymentTermsEnumeration")
    public String salesOrderPaymentTermsEnumeration;
    @JsonProperty("SalesOrderTotalQuantity")
    public int salesOrderTotalQuantity;
    @JsonProperty("SalesOrderAmountSubtotalWithoutTaxAndDiscount")
    public double salesOrderAmountSubtotalWithoutTaxAndDiscount;
    @JsonProperty("SalesOrderAmountShipping")
    public int salesOrderAmountShipping;
    @JsonProperty("SalesOrderAmountTotalDiscount")
    public int salesOrderAmountTotalDiscount;
    @JsonProperty("SalesOrderAmountTotalTax")
    public int salesOrderAmountTotalTax;
    @JsonProperty("SalesOrderAmountGrandTotal")
    public double salesOrderAmountGrandTotal;
    @JsonProperty("SalesOrderDetails")
    public List<SalesOrderDetail> salesOrderDetails;
    @JsonProperty("SalesOrderStatus")
    public String salesOrderStatus;
    @JsonProperty("SalesOrderCreationDate")
    public String salesOrderCreationDate;
    @JsonProperty("SalesOrderLastUpdatedDate")
    public String salesOrderLastUpdatedDate;
}
