package info.venkat.repository;

import info.venkat.model.DashboardEntity;
import info.venkat.model.TransactionEntity;
import org.springframework.data.repository.CrudRepository;

public interface DashboardRepository extends CrudRepository<DashboardEntity, String> {
}
