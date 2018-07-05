package com.yatsun.arthur;

import com.yatsun.arthur.auth.UserChecker;
import com.yatsun.arthur.strtegy.DBAuth;
import com.yatsun.arthur.strtegy.FileAuth;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();

        userChecker.check(new DBAuth("jdbc://etc"));

        userChecker.check(new FileAuth(new File("src/a.txt")));
    }
}
