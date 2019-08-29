package info.venkat.rest;

import info.venkat.model.DashboardEntity;
import info.venkat.service.impl.DashboardServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finance/dashboard")
public class DashboardController {

    Logger logger = LoggerFactory.getLogger(DashboardController.class);

    @Autowired
    DashboardServiceImpl DashboardService;

    @RequestMapping("/create")
    public DashboardEntity createDashboard(DashboardEntity myDashboard)
    {
        logger.debug(">> createDashboard");
        return DashboardService.addDashboard(myDashboard);
    }

    @RequestMapping("/create/default")
    public DashboardEntity createDefaultDashboard()
    {
        logger.debug(">> createDefaultDashboard");
        return DashboardService.createDefaultDashboard();
    }
}
