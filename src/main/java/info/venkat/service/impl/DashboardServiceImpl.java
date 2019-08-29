package info.venkat.service.impl;

import info.venkat.model.DashboardEntity;
import info.venkat.repository.DashboardRepository;
import info.venkat.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DashboardServiceImpl implements DashboardService {
    @Autowired
    private DashboardRepository DashboardRepository;

    public DashboardEntity addDashboard(DashboardEntity myDashboard) {
        return DashboardRepository.save(myDashboard);
    }

    public Optional<DashboardEntity> getDashboard(String DashboardId) {
        return DashboardRepository.findById(DashboardId);
    }

    public List<DashboardEntity> getAllDashboards() {
        List<DashboardEntity> Dashboards = new ArrayList<>();
        DashboardRepository.findAll().forEach(Dashboards::add);
        return Dashboards;
    }

    public void deleteDashboard(String DashboardId) {
        DashboardRepository.deleteById(DashboardId);
    }

    public DashboardEntity updateDashboard(DashboardEntity myDashboard) {
        return DashboardRepository.save(myDashboard);
    }

    @Override
    public DashboardEntity createDefaultDashboard() {
        DashboardEntity newDefaultDashboard = new DashboardEntity("jdoe", new java.util.Date(),1000f, 2000f, 3000f, 4000f);
        return addDashboard(newDefaultDashboard);
    }
}
