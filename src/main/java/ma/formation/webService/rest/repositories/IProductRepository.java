package ma.formation.webService.rest.repositories;

import ma.formation.webService.rest.model.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<ProductEntity,Long> {
}
