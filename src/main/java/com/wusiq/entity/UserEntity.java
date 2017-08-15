package com.wusiq.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户实体
 */
@Entity
@Table(name="t_user")     //表名
public class UserEntity implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name="userName")      //类属性对应着表字段
    private String userNmae;
    @Column(name="userAge")      //类属性对应着表字段
    private Integer userAge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserNmae() {
        return userNmae;
    }

    public void setUserNmae(String userNmae) {
        this.userNmae = userNmae;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}
