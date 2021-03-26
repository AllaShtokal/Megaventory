package alla.shtokal.dto.product.request;

import lombok.Data;

@Data
public class RootProductRequest {
    public MvProductRequest mvProductRequest;
    public String mvRecordAction;
    public String mvInsertUpdateDeleteSourceApplication;

}
