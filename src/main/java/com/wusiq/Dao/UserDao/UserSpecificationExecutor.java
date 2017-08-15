package com.wusiq.Dao.UserDao;

import com.wusiq.entity.UserEntity;

/**
 * 支持自定义sql的接口
 */
public interface UserSpecificationExecutor {
/*    根据用户id和userAge大于某个值的的条件更改userName*/
    void updateUserNameByIdOrAge(UserEntity entity);
}
