package com.hr.dao.impl;

import java.util.List;

import com.hr.dao.UserDao;
import com.hr.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 创建时间：2015-2-6 下午2:45:14 *  * @author andy * @version 2.2
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public int registerUser(User user) {
        try{
            this.getCurrentSession().save(user);
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
        return 1;
    }

    @Override
    public List<User> queryUserList() {
        List list = this.getCurrentSession().createQuery("from User").list();
        return list;
    }
}