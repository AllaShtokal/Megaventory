package alla.shtokal.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;


@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "client")
public class Client implements Serializable {

    private static final long serialVersionUID = -1674802143717599061L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name",
            nullable = false)
    private String name;

    @Column(name = "email",
            unique = true,
            nullable = false)
    private String email;

    @NotBlank
    @Column(name = "shopping_address",
            length = 100)
    private String shoppingAddress;

    @NotBlank
    @Column(name = "phone",
            length = 13)
    private String phone;



}
