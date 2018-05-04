package repository;

import domain.FilterProduct;
import org.springframework.data.repository.CrudRepository;

public interface FilterProductRepo extends CrudRepository<FilterProduct, Long> {
}
