package web.service;

import web.models.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void addUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
    User getUserById(Long id);

}
