/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.skoneczny.jdbcDemo;


import pl.skoneczny.jdbcDemo.doa.JdbcDoaImpl;
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
        Circle circle = new JdbcDoaImpl().getCircle(1);
        System.out.println(circle.getName());
    }
    
}