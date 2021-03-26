package alla.shtokal.dto.product.request;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class RootProductRequest {

    @Value("${apikey}")
    public String APIKEY;
    public MvProduct mvProduct;
    public String mvRecordAction;

}
