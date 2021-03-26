package alla.shtokal.dto.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MvContact {

    @JsonProperty("ContactName")
    public String contactName;
    @JsonProperty("ContactDepartment")
    public String contactDepartment;
    @JsonProperty("ContactEmail")
    public String contactEmail;
    @JsonProperty("ContantIsPrimary")
    public String contantIsPrimary;
}
