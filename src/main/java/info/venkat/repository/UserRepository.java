package info.venkat.repository;

import info.venkat.model.UserEntity;
import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<UserEntity, String> {
}
