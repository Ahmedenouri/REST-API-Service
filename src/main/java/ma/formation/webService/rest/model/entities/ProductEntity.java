package ma.formation.webService.rest.model.entities;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tblProduct")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduct")
    private Long idProduct;
    @Column(name = "nameProduct")
    @NotNull
    private String nameProduct;
    @Column(name = "priceProduct")
    @NotNull
    private double priceProduct;
    @Column(name = "quantityProduct")
    @NotNull
    private int quantityProduct;

    @ManyToOne
    @JoinColumn(name = "IdCategory")
    private CategoryEntity categoryEntity;

}
