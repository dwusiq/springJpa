package com.wusiq.Dao.UserDao;

import com.wusiq.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 继承JpaRepository<UserEntity,Integer>是为了实现自动化的JPARepository和@Query;
 * 继承UserCustomize是为了确保eUserCustomize接口的方法会被声明在UserRepository接口;
 */
public interface UserRepository extends JpaRepository<UserEntity,Integer>,UserSpecificationExecutor {

    /*根据userName模糊查询*/
    @Query(value = "select * from t_user where userName like ?1%",nativeQuery=true)
    List<UserEntity> queryLikeUserName(String userName);
}
