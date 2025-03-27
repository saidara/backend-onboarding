package zealthy.backend_flow.model;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "admin")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String componentName;  // "aboutMe", "address", "birthdate"
    private int pageNumber;  // 2 or 3
}


