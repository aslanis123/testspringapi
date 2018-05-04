package repository;

import domain.Migration;
import org.springframework.data.repository.CrudRepository;

public interface MigrationRepo extends CrudRepository<Migration, Long> {
}
