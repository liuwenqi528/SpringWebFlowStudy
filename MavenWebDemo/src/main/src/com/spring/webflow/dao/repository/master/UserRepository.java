package com.spring.webflow.dao.repository.master;

import com.spring.webflow.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by
 *
 * @author: liuwenqi on 2018-02-10.
 * Description:
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * 根据用户名和密码查询
     *
     * @param userName
     * @param password
     * @return
     */
    User findOneByUserNameEqualsAndPasswordEquals(String userName, String password);
}
