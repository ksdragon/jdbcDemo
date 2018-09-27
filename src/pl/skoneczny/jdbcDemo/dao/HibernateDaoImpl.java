/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.skoneczny.jdbcDemo.dao;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ksdra
 */
@Repository
public class HibernateDaoImpl {
    
    @Autowired
    private  SessionFactory sessionFactory;
    
    public int getCircleCount(){
        String hql = "select count(*) from Circle";
        Query query = getSessionFactory().openSession().createQuery(hql);
        return ((Long) query.uniqueResult()).intValue();
        
        
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
}
