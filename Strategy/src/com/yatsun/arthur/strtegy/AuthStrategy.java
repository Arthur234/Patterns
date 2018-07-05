package com.yatsun.arthur.strtegy;

/**
 * Created by arthur on 03.07.18.
 */
public interface AuthStrategy {
    boolean checkLogin(String name, String password);
}
