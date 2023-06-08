package org.example.controller;

import org.example.annotation.Controller;
import org.example.annotation.Inject;
import org.example.service.UserSerivce;

@Controller
public class UserController {

    private final UserSerivce userSerivce;

    @Inject
    public UserController(UserSerivce userSerivce) {
        this.userSerivce = userSerivce;
    }

    public UserSerivce getUserSerivce() {
        return userSerivce;
    }
}
