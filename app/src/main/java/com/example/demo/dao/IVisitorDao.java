package com.example.demo.dao;

import com.example.demo.entity.Visitor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository(IVisitorDao.DAO_BEAN_NAME)
public interface IVisitorDao extends PagingAndSortingRepository<Visitor,String> {
    /**
     * Spring注册时的名称.
     */
    public static final String DAO_BEAN_NAME = "visitorDao";
    Visitor findByIp(String ip);
}
