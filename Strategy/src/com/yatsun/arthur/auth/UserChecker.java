package com.yatsun.arthur.auth;

import com.yatsun.arthur.strtegy.AuthStrategy;

/**
 * Created by arthur on 03.07.18.
 */
public class UserChecker {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean check(AuthStrategy authStrategy) {
        return authStrategy.checkLogin(name, password);
    }
}
