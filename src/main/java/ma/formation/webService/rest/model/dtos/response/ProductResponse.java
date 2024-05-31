package ma.formation.webService.rest.model.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.formation.webService.rest.model.dtos.requestdto.CategoryRequest;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private String nameProduct;
    private double priceProduct;


    private CategoryResponse categoryResponse;

}
