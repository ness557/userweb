package simple.microservices.userweb.service;

import simple.microservices.userweb.model.User;

import java.util.List;

public interface UserService {

    Status saveUser(User user);
    Status removeUser(User user);
    Status removeUser(int id);
    User getUserById(int id);
    User getUserByUsername(String username);
    List<User> getUserList();
}
