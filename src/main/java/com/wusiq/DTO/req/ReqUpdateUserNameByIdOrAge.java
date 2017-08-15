package com.wusiq.DTO.req;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * 根据用户id或者年龄修改用户名,入参实体类
 */
public class ReqUpdateUserNameByIdOrAge {
    @Min(value = 1,message="please id>1")
    private Integer id;
    @NotEmpty(message="userName is empty")
    private String userName;
    @Min(value = 1,message="please userAge>1")
    @Max(value = 200,message="userAge<200")
    private Integer userAge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}
