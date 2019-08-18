package info.venkat.repository;

import info.venkat.model.TransactionEntity;
import info.venkat.model.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<TransactionEntity, String> {
}
