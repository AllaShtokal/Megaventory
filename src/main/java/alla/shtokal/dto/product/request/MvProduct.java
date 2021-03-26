package alla.shtokal.dto.product.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MvProduct {
    @JsonProperty("ProductType")
    public String productType;
    @JsonProperty("ProductSKU")
    public String productSKU;
    @JsonProperty("ProductDescription")
    public String productDescription;

}
