package ma.formation.webService.rest.service.serviceImpl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.formation.webService.rest.model.dtos.requestdto.ProductRequest;
import ma.formation.webService.rest.model.dtos.response.ProductResponse;
import ma.formation.webService.rest.model.mappers.IProductMapper;
import ma.formation.webService.rest.repositories.IProductRepository;
import ma.formation.webService.rest.service.IProductService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ProductServiceImpl implements IProductService {
    private final IProductRepository iProductRepository;
    private final IProductMapper iProductMapper;

    @Override
    public ProductResponse saveProduct(ProductRequest productRequest) {
        log.debug("Save Product Servive {}",productRequest);
        return iProductMapper.map(iProductRepository.save(iProductMapper.map(productRequest)));
    }
}
