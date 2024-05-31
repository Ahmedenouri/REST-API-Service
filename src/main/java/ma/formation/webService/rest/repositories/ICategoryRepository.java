package ma.formation.webService.rest.repositories;

import ma.formation.webService.rest.model.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<CategoryEntity,Long> {
}
