package com.neuedu.entity;

import com.neuedu.jdbc.JDBC;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring-config03.xml")
public class SprintTest {

    @Autowired
    @Qualifier("mysqlJDBC")
    private JDBC jdbc;

    @Test
    public void print(){
     jdbc.print();
    }
}
