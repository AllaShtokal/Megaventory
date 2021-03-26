package alla.shtokal.dto.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RootClientRequest {

    public MvSupplierClient mvSupplierClient;
    public String mvGrantPermissionsToAllUser;
    public String mvRecordAction;
    public String mvInsertUpdateDeleteSourceApplication;
    @JsonProperty("APIKEY")
    public String APIKEY;
}
