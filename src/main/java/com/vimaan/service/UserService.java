package com.vimaan.service;

import com.vimaan.model.Login;
import com.vimaan.model.User;

/**
 * Created by pc on 9/25/2017.
 */
public interface UserService {

    public User validateUser(Login login);
    public  void register(User user);
}
