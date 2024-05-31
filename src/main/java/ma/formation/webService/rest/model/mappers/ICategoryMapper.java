package ma.formation.webService.rest.model.mappers;

import ma.formation.webService.rest.model.dtos.requestdto.CategoryRequest;
import ma.formation.webService.rest.model.dtos.response.CategoryResponse;
import ma.formation.webService.rest.model.entities.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ICategoryMapper {
    CategoryEntity map (CategoryRequest categoryRequest);
    CategoryResponse map (CategoryEntity categoryEntity);
}
