package com.crm.Service;

import com.crm.Dao.UserDaoImpl;
import com.crm.Entity.User;

public class UserServiceImpl implements UserService {
    UserDaoImpl userDaoImpl;

    public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    public User login(User user) {
        return userDaoImpl.loginUser(user);
    }
}
