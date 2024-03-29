package info.venkat.rest;

import info.venkat.model.UserEntity;
import info.venkat.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finance/user")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/create")
    public UserEntity createUser(UserEntity myUser)
    {
        logger.debug(">> createUser");
        return userService.addUser(myUser);
    }

    @RequestMapping("/create/default")
    public UserEntity createDefaultUser()
    {
        logger.debug(">> createDefaultUser");
        return userService.createDefaultUser();
    }
}
