package repository;

import domain.CategoryProduct;
import org.springframework.data.repository.CrudRepository;

public interface CategoryProductRepo extends CrudRepository<CategoryProduct, Long> {
}
