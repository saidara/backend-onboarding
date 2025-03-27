package zealthy.backend_flow.model;

import jakarta.persistence.Embeddable;
import lombok.*;
@Embeddable
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
}
