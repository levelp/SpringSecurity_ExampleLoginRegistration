package org.levelp.auth.dao;

import org.levelp.auth.model.User;

/**
 * @author Anastasiya Solodkaya.
 */
public interface UsersDAO {
    void register(User user);
    User findByLogin(String login);
}
