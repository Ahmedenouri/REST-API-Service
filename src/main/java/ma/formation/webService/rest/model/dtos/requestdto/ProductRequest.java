package ma.formation.webService.rest.model.dtos.requestdto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.formation.webService.rest.model.entities.CategoryEntity;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private Long idProduct;
    private String nameProduct;
    private double priceProduct;
    private int quantityProduct;


    private CategoryRequest categoryRequest;

}
