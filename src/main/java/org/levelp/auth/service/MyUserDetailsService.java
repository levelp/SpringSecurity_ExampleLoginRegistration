package org.levelp.auth.service;

import org.levelp.auth.dao.UsersDAO;
import org.levelp.auth.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Arrays;

/**
 * @author Anastasiya Solodkaya.
 */
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UsersDAO dao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = dao.findByLogin(username);
        return new org.springframework.security.core.userdetails.User(user.login, user.password,
                Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));
    }
}
