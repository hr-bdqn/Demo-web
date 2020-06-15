package com.hr.service.impl;

import com.hr.dao.UserDao;
import com.hr.entity.User;
import com.hr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuhuanran
 * @version 1.0
 * @date 2020/6/15 16:31
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int registerUser(User user) {
        return userDao.registerUser(user);
    }

    @Override
    public List<User> queryUserList() {
        return userDao.queryUserList();
    }
}
