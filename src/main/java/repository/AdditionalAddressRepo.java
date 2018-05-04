package repository;

import domain.AdditionalAddress;
import org.springframework.data.repository.CrudRepository;

public interface AdditionalAddressRepo extends CrudRepository<AdditionalAddress, Long> {
}
