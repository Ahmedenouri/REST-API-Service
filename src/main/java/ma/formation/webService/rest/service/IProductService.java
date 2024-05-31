package ma.formation.webService.rest.service;

import ma.formation.webService.rest.model.dtos.requestdto.ProductRequest;
import ma.formation.webService.rest.model.dtos.response.ProductResponse;

public interface IProductService {
    ProductResponse saveProduct (ProductRequest productRequest);
}
