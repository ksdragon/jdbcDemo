/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.skoneczny.jdbcDemo.dao;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

/**
 *
 * @author ksdra
 */

/**klasa pomocnica wykorzystujaca roszerzenei SimpleJdbcDaoSupport
    metoda getJdbcTemplate() pobiera członaka perent klas, wykorzystując tą klasę możemy pominąć 
    całkowicie klasę JdbcDaoImpl, a przdewszystkim tworzenie zmiennych typu: 
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    i związancy z nimi geterów i seterów.
     
*/
public class SimpleJdbcDaoImpl extends SimpleJdbcDaoSupport {
    
    public int getCircleCount(){
    String sql = "SELECT COUNT(*) FROM CIRCLE";
        return this.getJdbcTemplate().queryForInt(sql);
    }
}
