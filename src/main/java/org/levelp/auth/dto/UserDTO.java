package org.levelp.auth.dto;

/**
 * @author Anastasiya Solodkaya.
 */
public class UserDTO {
    private String login;
    private String password;

    public UserDTO() {
    }

    public UserDTO(String login, String password) {
        this();
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
