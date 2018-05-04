package repository;

import domain.PasswordReset;
import org.springframework.data.repository.CrudRepository;

public interface PasswordResetRepo extends CrudRepository<PasswordReset, Long> {
}
