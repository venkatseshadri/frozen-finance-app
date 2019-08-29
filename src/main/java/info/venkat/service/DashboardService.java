package info.venkat.service;

import info.venkat.model.DashboardEntity;

import java.util.List;
import java.util.Optional;

public interface DashboardService {
    DashboardEntity addDashboard(DashboardEntity myDashboardEntity);
    Optional<DashboardEntity> getDashboard(String DashboardEntityId);
    List<DashboardEntity> getAllDashboards();
    void deleteDashboard(String DashboardEntityId);
    DashboardEntity updateDashboard(DashboardEntity myDashboardEntity);
    DashboardEntity createDefaultDashboard();
}
