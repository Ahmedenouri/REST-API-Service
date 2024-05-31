package ma.formation.webService.rest.model.mappers;

import ma.formation.webService.rest.model.dtos.requestdto.ProductRequest;
import ma.formation.webService.rest.model.dtos.response.ProductResponse;
import ma.formation.webService.rest.model.entities.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface IProductMapper {

    @Mapping(source = "categoryRequest", target = "categoryEntity")
    ProductEntity map (ProductRequest productRequest);
    @Mapping(source = "categoryEntity", target = "categoryResponse")
    ProductResponse map (ProductEntity productEntity);
}
