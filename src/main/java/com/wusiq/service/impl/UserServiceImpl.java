package com.wusiq.service.impl;

import com.wusiq.Dao.UserDao.UserRepository;
import com.wusiq.entity.UserEntity;
import com.wusiq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户管理服务的实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public boolean addRow(UserEntity t) {
        UserEntity resultEntity = userRepository.save(t);
        if(null != resultEntity && null != resultEntity.getId()){
            return true;
        }
        return false;
    }

    @Override
    public void deleteRow(int id) {
        boolean isExist = userRepository.exists(id);
        if(isExist){
            userRepository.delete(id);
        }
    }

    @Override
    public boolean updateRow(UserEntity t) {
        boolean isExist = userRepository.exists(t.getId());
        if(isExist){
            userRepository.save(t);
            return true;
        }
        return false;
    }

    @Override
    public UserEntity queryRow(int id) {
        return userRepository.findOne(id);
    }

    @Override
    public List<UserEntity> queryRowList() {
        return userRepository.findAll();
    }

    /* 根据用户id和userAge大于某个值的的条件更改userName*/
    @Override
    public void updateUserNameByIdOrAge(UserEntity entity) {
        userRepository.updateUserNameByIdOrAge(entity);
    }

    @Override
    public List<UserEntity> queryLikeUserName(String userName) {
        return userRepository.queryLikeUserName(userName);
    }
}
