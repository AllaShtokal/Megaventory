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
@Table(name = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = -1674802143717599061L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sku",
            nullable = false)
    private Long sku;

    @Size(min = 3, max = 100)
    @NotBlank
    @Column(name = "description",
            length = 100)
    private String description;

    @Column(name = "salesPrice")
    private Double salesPrice;

    @Column(name = "purchasePrice")
    private Double purchasePrice;


}
