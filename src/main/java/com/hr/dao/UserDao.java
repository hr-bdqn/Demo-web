package com.hr.dao;

import com.hr.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liuhuanran
 * @version 1.0
 * @date 2020/6/15 16:18
 */
public interface UserDao {

    int registerUser(User user);

    List<User> queryUserList();
}
