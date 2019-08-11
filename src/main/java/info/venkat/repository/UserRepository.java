package info.venkat.repository;

import info.venkat.model.User;
import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<User, String> {
}
