package com.wusiq.Dao.UserDao.impl;

import com.wusiq.Dao.UserDao.UserSpecificationExecutor;
import com.wusiq.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * 1、这个类名组成如下：UserRepository接口名+Impl，因为：当Spring Data JPA为Repository接口生成实现的时候，它还会查找名字
 * 与接口相同，并且添加了Impl后缀的一个类。如果这个类存在的话，Spring Data JPA将会把它的方法与Spring Data JPA所生成的
 * 方法合在一起
 * 2、接口的实现,可以自己编辑方法的具体实现
 */
@Repository
@Transactional
public class UserRepositoryImpl implements UserSpecificationExecutor {
    private static Logger LOGGER =  LoggerFactory.getLogger(UserRepositoryImpl.class);
    @PersistenceContext
    private EntityManager em;

    /* 根据用户id和userAge大于某个值的的条件更改userName*/
    @Override
    public void updateUserNameByIdOrAge(UserEntity entity) {
        String sql = String.format("update UserEntity set userName='%s' where id=%d and userAge = %d", entity.getUserNmae(), entity.getId(), entity.getUserAge());
        int i = em.createQuery(sql).executeUpdate();
        if(i>0){
            LOGGER.info("update t_user success,count:"+i);
        }
    }
}
