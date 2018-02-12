package com.spring.webflow.dao.repository;

import com.querydsl.core.types.Predicate;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.QueryDslJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

/**
 * 自定义 Repository 的实现类，作为 Repository 代理的自定义类来执行,主要提供自定义的公用方法。
 * 父类 QueryDslJpaRepository 帮我们实现了 JpaRepository 中的方法，
 * <p>
 * 下一步需创建一个自定义工厂，在该工厂中注册自定义的 BaseRepositoryImpl，
 * 该工厂的具体写法参照 Spring Data 的 JpaRepositoryFactoryBean 和 JpaRepositoryFactory
 *
 * @author wangtao
 * 2017/8/19
 */
@NoRepositoryBean
public class BaseRepositoryImpl<T, ID extends Serializable> extends QueryDslJpaRepository<T, ID> implements BaseRepository<T, ID>, Serializable {

    private static final long serialVersionUID = -552345460226216122L;

    @PersistenceContext
    private final EntityManager entityManager;

    BaseRepositoryImpl(JpaEntityInformation<T, ID> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<T> findList(Predicate predicate) {
        return findAll(predicate);
    }

}
