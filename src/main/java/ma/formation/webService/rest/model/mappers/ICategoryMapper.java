package ma.formation.webService.rest.model.mappers;

import ma.formation.webService.rest.model.dtos.requestdto.CategoryRequest;
import ma.formation.webService.rest.model.dtos.response.CategoryResponse;
import ma.formation.webService.rest.model.entities.CategoryEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ICategoryMapper {
    CategoryEntity map (CategoryRequest categoryRequest);
    CategoryResponse map (CategoryEntity categoryEntity);
    List<CategoryEntity> mapListEntity (List<CategoryRequest> categoryRequest);
    List<CategoryResponse> mapListRes(List<CategoryEntity> categoryEntity);
}
