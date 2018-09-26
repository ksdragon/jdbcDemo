/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.skoneczny.jdbcDemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.skoneczny.jdbcDemo.dao.JdbcDaoImpl;
import pl.skoneczny.jdbcDemo.model.Circle;

/**
 *
 * @author HP ProDesk
 */
public class JdbcDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        tworzymy kontener i używamy takiej właściwości w pliku sping.xml która pozwala na skanowanie oznaconych 
//        bibliotek @component @service @controler
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        
        //pobieramy z kontenera bean i zaczynamy nim zarządzc
        JdbcDaoImpl dao = ctx.getBean("jdbcDaoImpl", JdbcDaoImpl.class);        
        
//        Circle circle = dao.getCircle(1);
//        System.out.println(circle.getName());
          //System.out.println(dao.getCircleCount());
          //System.out.println(dao.getCircleName(1));
          //System.out.println(dao.getCircleForId(1).getName());
          //System.out.println(dao.getAllCircles().size());
          dao.insertCircle(new Circle(3,"Thrid Circle"));
          System.out.println(dao.getAllCircles().size());
          //dao.createTriangleTable();
    }
    
}
