package nimblix.in.HealthCareHub.service;

import nimblix.in.HealthCareHub.model.User;
import nimblix.in.HealthCareHub.repository.UserRepository;
import nimblix.in.HealthCareHub.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserService {

    public UserResponse updateUser(User user);
}
