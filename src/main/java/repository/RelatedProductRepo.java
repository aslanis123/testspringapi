package repository;

import domain.RelatedProduct;
import org.springframework.data.repository.CrudRepository;

public interface RelatedProductRepo extends CrudRepository<RelatedProduct, Long> {
}
