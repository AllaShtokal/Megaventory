package alla.shtokal.dto.product.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class MvProductResponse {
    @JsonProperty("ProductID")
    public int productID;
    @JsonProperty("ProductType")
    public String productType;
    @JsonProperty("ProductSKU")
    public String productSKU;
    @JsonProperty("ProductEAN")
    public String productEAN;
    @JsonProperty("ProductDescription")
    public String productDescription;
    @JsonProperty("ProductVersion")
    public String productVersion;
    @JsonProperty("ProductLongDescription")
    public String productLongDescription;
    @JsonProperty("ProductCategoryID")
    public int productCategoryID;
    @JsonProperty("ProductUnitOfMeasurement")
    public String productUnitOfMeasurement;
    @JsonProperty("ProductSellingPrice")
    public int productSellingPrice;
    @JsonProperty("ProductPurchasePrice")
    public int productPurchasePrice;
    @JsonProperty("ProductWeight")
    public int productWeight;
    @JsonProperty("ProductLength")
    public int productLength;
    @JsonProperty("ProductBreadth")
    public int productBreadth;
    @JsonProperty("ProductHeight")
    public int productHeight;
    @JsonProperty("ProductImageURL")
    public String productImageURL;
    @JsonProperty("ProductComments")
    public String productComments;
    @JsonProperty("ProductCustomField1")
    public String productCustomField1;
    @JsonProperty("ProductCustomField2")
    public String productCustomField2;
    @JsonProperty("ProductCustomField3")
    public String productCustomField3;
    @JsonProperty("ProductCustomField4")
    public String productCustomField4;
    @JsonProperty("ProductCustomField5")
    public String productCustomField5;
    @JsonProperty("ProductCustomField6")
    public String productCustomField6;
    @JsonProperty("ProductCustomField7")
    public String productCustomField7;
    @JsonProperty("ProductCustomField8")
    public String productCustomField8;
    @JsonProperty("ProductCustomField9")
    public String productCustomField9;
    @JsonProperty("ProductCustomField10")
    public String productCustomField10;
    @JsonProperty("ProductOption1")
    public String productOption1;
    @JsonProperty("ProductOption2")
    public String productOption2;
    @JsonProperty("ProductOption3")
    public String productOption3;
    @JsonProperty("ProductOption4")
    public String productOption4;
    @JsonProperty("ProductOption5")
    public String productOption5;
    @JsonProperty("ProductMainSupplierID")
    public int productMainSupplierID;
    @JsonProperty("ProductMainSupplierPrice")
    public int productMainSupplierPrice;
    @JsonProperty("ProductMainSupplierSKU")
    public String productMainSupplierSKU;
    @JsonProperty("ProductMainSupplierDescription")
    public String productMainSupplierDescription;
    @JsonProperty("ProductCreationDate")
    public Date productCreationDate;
}
