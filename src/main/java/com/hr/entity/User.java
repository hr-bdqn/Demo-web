package com.hr.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {

    private Long userId;
    private String userName;
    private String email;
    private String callphone;
    private String password;
    private String salt;
    private int state;
    private Date create_time;

    public User() {
    }

    @Id
    @Column(name = "user_id", unique = true, nullable = false, length = 36)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    @Column(name = "user_name", nullable = false)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Column(name = "callphone", nullable = false)
    public String getCallphone() {
        return callphone;
    }

    public void setCallphone(String callphone) {
        this.callphone = callphone;
    }

    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Column(name = "salt", nullable = false)
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    @Column(name = "state", nullable = false)
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
    @Column(name = "create_time", nullable = false)
    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}