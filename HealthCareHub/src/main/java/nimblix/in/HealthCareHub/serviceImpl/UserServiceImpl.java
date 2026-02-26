package nimblix.in.HealthCareHub.serviceImpl;

import nimblix.in.HealthCareHub.constants.HealthCareConstants;
import nimblix.in.HealthCareHub.model.User;
import nimblix.in.HealthCareHub.repository.UserRepository;
import nimblix.in.HealthCareHub.response.UserResponse;
import nimblix.in.HealthCareHub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponse updateUser(User user) {
        UserResponse response=new UserResponse();
        Optional<User> u=userRepository.findById(user.getId());

        if(u.isPresent()){
            User user2 =u.get();
            user2.setId(user.getId());
            user2.setRole(user.getRole());
            user2.setEmail(user.getEmail());
            user2.setPassword(user.getPassword());
            user2.setUpdatedTime(user.getUpdatedTime());
            userRepository.save(user2);
            response.setMessage(HealthCareConstants.USER_UPDATE);
            response.setObject(user2);
            return response;
        }
        else{
            throw new RuntimeException("User id Not Found");
        }
    }
}
