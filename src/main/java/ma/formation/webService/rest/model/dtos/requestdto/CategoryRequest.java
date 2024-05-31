package ma.formation.webService.rest.model.dtos.requestdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRequest {
    private Long idCategory;
    private String nameCategory;
}
