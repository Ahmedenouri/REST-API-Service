package ma.formation.webService.rest.service.serviceImpl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.formation.webService.rest.model.dtos.requestdto.CategoryRequest;
import ma.formation.webService.rest.model.dtos.response.CategoryResponse;
import ma.formation.webService.rest.model.mappers.ICategoryMapper;
import ma.formation.webService.rest.repositories.ICategoryRepository;
import ma.formation.webService.rest.service.ICategoryService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class CategoryServiceImpl implements ICategoryService {
    private final ICategoryRepository iCategoryRepository;
    private final ICategoryMapper iCategoryMapper;
    @Override
    public CategoryResponse saveCategory(CategoryRequest categoryRequest) {
        log.debug("Save Category Service {}",categoryRequest);
        return iCategoryMapper.map(iCategoryRepository.save(iCategoryMapper.map(categoryRequest)));
    }
}
