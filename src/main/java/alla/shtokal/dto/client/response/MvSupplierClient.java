package alla.shtokal.dto.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

//response
@Data
public class MvSupplierClient {
    @JsonProperty("SupplierClientID")
    public int supplierClientID;
    @JsonProperty("SupplierClientType")
    public String supplierClientType;
    @JsonProperty("SupplierClientName")
    public String supplierClientName;
    @JsonProperty("SupplierClientBillingAddress")
    public String supplierClientBillingAddress;
    @JsonProperty("SupplierClientShippingAddress1")
    public String supplierClientShippingAddress1;
    @JsonProperty("SupplierClientShippingAddress2")
    public String supplierClientShippingAddress2;
    @JsonProperty("SupplierClientPhone1")
    public String supplierClientPhone1;
    @JsonProperty("SupplierClientPhone2")
    public String supplierClientPhone2;
    @JsonProperty("SupplierClientFax")
    public String supplierClientFax;
    @JsonProperty("SupplierClientIM")
    public String supplierClientIM;
    @JsonProperty("SupplierClientEmail")
    public String supplierClientEmail;
    @JsonProperty("SupplierClientTaxID")
    public String supplierClientTaxID;
    @JsonProperty("SupplierClientCurrency")
    public String supplierClientCurrency;
    @JsonProperty("SupplierClientPaymentTermsEnum")
    public String supplierClientPaymentTermsEnum;
    @JsonProperty("SupplierClientComments")
    public String supplierClientComments;
    @JsonProperty("SupplierClientCustomField1")
    public String supplierClientCustomField1;
    @JsonProperty("SupplierClientCustomField2")
    public String supplierClientCustomField2;
    @JsonProperty("SupplierClientCustomField3")
    public String supplierClientCustomField3;
    @JsonProperty("SupplierClientCustomField4")
    public String supplierClientCustomField4;
    @JsonProperty("SupplierClientCustomField5")
    public String supplierClientCustomField5;
    @JsonProperty("SupplierClientOption1")
    public boolean supplierClientOption1;
    @JsonProperty("SupplierClientOption2")
    public boolean supplierClientOption2;
    @JsonProperty("SupplierClientOption3")
    public boolean supplierClientOption3;
    @JsonProperty("SupplierClientOption4")
    public boolean supplierClientOption4;
    @JsonProperty("SupplierClientOption5")
    public boolean supplierClientOption5;
    @JsonProperty("SupplierClientCreationDate")
    public String supplierClientCreationDate;
}
