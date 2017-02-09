package org.levelp.auth.service;

import org.levelp.auth.dao.UsersDAO;
import org.levelp.auth.dto.UserDTO;
import org.levelp.auth.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Anastasiya Solodkaya.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersDAO dao;
    @Autowired
    private PasswordEncoder encoder;

    @Override
    public void register(UserDTO user) {
        dao.register(new User(user.getLogin(), encoder.encode(user.getPassword())));
    }

    @Override
    public UserDTO findByLogin(String login) {
        User user = dao.findByLogin(login);
        return new UserDTO(user.login, user.password);
    }

}
