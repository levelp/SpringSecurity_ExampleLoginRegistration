package org.levelp.auth.model;

import javax.persistence.*;

/**
 * @author Anastasiya Solodkaya.
 */
@Entity
@Table(name = "myuser")
public class User {
    public User() {
    }

    public User(String login, String password) {
        this();
        this.login = login;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(columnDefinition = "varchar(100)")
    public String login;
    @Column(columnDefinition = "varchar(60)")
    public String password;


}
