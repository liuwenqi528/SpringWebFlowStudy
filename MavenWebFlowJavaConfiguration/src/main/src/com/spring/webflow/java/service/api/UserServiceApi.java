package com.spring.webflow.java.service.api;

import com.spring.webflow.java.entity.User;

import java.util.List;

/**
 * Created by
 *
 * @author: liuwenqi on 2018-02-10.
 * Description:
 */
public interface UserServiceApi {

    /**
     * 添加或者修改
     *
     * @param user
     * @return
     */
    User saveOrUpdate(User user);

    /**
     * 删除：可多删
     *
     * @param ids
     * @return
     */
    int delete(String ids);

    /**
     * 全查询
     *
     * @param
     * @return
     */
    List<User> getAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User getOne(Integer id);

    /**
     * 登录
     * @param user
     * @return
     */
    User login(User user);


}

