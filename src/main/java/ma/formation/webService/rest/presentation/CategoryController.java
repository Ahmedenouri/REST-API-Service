package ma.formation.webService.rest.presentation;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.formation.webService.rest.model.dtos.requestdto.CategoryRequest;
import ma.formation.webService.rest.model.dtos.response.CategoryResponse;
import ma.formation.webService.rest.service.ICategoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-category")
@Slf4j
@AllArgsConstructor
public class CategoryController {
    private final ICategoryService iCategoryService;
    @PostMapping("/create-product")
    public CategoryResponse createCategory (@RequestBody CategoryRequest categoryRequest){
        log.debug("Create Product Controller {}",categoryRequest);
        return iCategoryService.saveCategory(categoryRequest);
    }
}
