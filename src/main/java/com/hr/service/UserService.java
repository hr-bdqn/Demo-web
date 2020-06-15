package com.hr.service;

import com.hr.entity.User;

import java.util.List;

/**
 * @author liuhuanran
 * @version 1.0
 * @date 2020/6/15 16:30
 */
public interface UserService {
    int registerUser(User user);

    List<User> queryUserList();
}
