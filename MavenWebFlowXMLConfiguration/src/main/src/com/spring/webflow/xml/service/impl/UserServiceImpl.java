package com.spring.webflow.xml.service.impl;

import com.spring.webflow.xml.dao.repository.master.UserRepository;
import com.spring.webflow.xml.entity.User;
import com.spring.webflow.xml.service.api.UserServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by
 *
 * @author: liuwenqi on 2018-02-10.
 * Description:
 */
@Service
public class UserServiceImpl implements UserServiceApi {

    @Autowired(required = true)
    private UserRepository userRepository;

    /**
     * 添加或者修改
     *
     * @param user
     * @return
     */
    @Override
    public User saveOrUpdate(User user) {

        return userRepository.save(user);
    }

    /**
     * 删除：可多删
     *
     * @param ids
     * @return
     */
    @Override
    public int delete(String ids) {

        return 0;
    }

    /**
     * 全查询
     *
     * @param
     * @return
     */
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @Override
    public User getOne(Integer id) {
        return null;
    }

    /**
     * 登录
     *
     * @param user
     * @return
     */
    @Override
    public User login(User user) {
        User u = userRepository.findOneByUserNameEqualsAndPasswordEquals(user.getUserName(),user.getPassword());
        return u;
    }
}
