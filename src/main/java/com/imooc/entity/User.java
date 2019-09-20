package com.imooc.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private int status;
    private Timestamp createTime;
    private Timestamp lastLoginTime;
    private Timestamp lastUpdateTime;
    private String avatar;




}
