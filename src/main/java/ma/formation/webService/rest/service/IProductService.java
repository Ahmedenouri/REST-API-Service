package ma.formation.webService.rest.service;

import ma.formation.webService.rest.model.dtos.requestdto.ProductRequest;
import ma.formation.webService.rest.model.dtos.response.CategoryResponse;
import ma.formation.webService.rest.model.dtos.response.ProductResponse;

import java.util.List;

public interface IProductService {
    ProductResponse saveProduct (ProductRequest productRequest);
    List<ProductResponse> getAllProduct ();
    void deleteProductById (Long idProduct);
    ProductResponse updateProduct (ProductRequest productRequest);
}
