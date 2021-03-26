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
@Table(name = "product_table")
public class Product implements Serializable {

    private static final long serialVersionUID = -4585902143599061L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sku",
            nullable = false)
    private Long sku;

    @Column(name = "mvId")
    private Long mvId;

    @Size(min = 3, max = 100)
    @NotBlank
    @Column(name = "description",
            length = 100)
    private String description;

    @Column(name = "sales_price")
    private Double salesPrice;

    @Column(name = "purchase_price")
    private Double purchasePrice;


}
