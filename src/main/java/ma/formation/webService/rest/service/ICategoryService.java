package ma.formation.webService.rest.service;

import ma.formation.webService.rest.model.dtos.requestdto.CategoryRequest;
import ma.formation.webService.rest.model.dtos.response.CategoryResponse;

import java.util.List;

public interface ICategoryService {
    CategoryResponse saveCategory (CategoryRequest categoryRequest);
}
