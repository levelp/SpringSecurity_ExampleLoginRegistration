package org.levelp.auth.service;

import org.levelp.auth.dto.UserDTO;

/**
 * @author Anastasiya Solodkaya.
 */
public interface UserService {
    void register(UserDTO user);
    UserDTO findByLogin(String login);
}
