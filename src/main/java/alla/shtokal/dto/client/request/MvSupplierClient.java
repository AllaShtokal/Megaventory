package alla.shtokal.dto.client.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
//request
@Data
public class MvSupplierClient {
    @JsonProperty("SupplierClientType")
    public String supplierClientType;
    @JsonProperty("SupplierClientName")
    public String supplierClientName;
    public List<MvContact> mvContacts;
    @JsonProperty("SupplierClientBillingAddress")
    public String supplierClientBillingAddress;
    @JsonProperty("SupplierClientShippingAddress")
    public String supplierClientShippingAddress;
}
