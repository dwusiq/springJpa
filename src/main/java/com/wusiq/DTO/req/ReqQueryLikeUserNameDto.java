package com.wusiq.DTO.req;

/**
 * 根据用户名模糊查询用户信息入参实体类
 */
public class ReqQueryLikeUserNameDto {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
