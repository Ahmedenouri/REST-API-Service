package ma.formation.webService.rest.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tblCategory")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategory")
    private Long idCategory;
    @Column(name = "nameCategory")
    @NotNull
    private String nameCategory;

    @OneToMany(mappedBy = "categoryEntity")
    private Set<ProductEntity> productEntitySet;
}
