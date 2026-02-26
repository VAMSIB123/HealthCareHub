package nimblix.in.HealthCareHub.controller;

import nimblix.in.HealthCareHub.model.User;
import nimblix.in.HealthCareHub.response.UserResponse;
import nimblix.in.HealthCareHub.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @PutMapping("/updateUser")
    public UserResponse updateUser(@RequestBody User user){
        return userServiceImpl.updateUser(user);
    }
}
