package com.neuedu.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userjdbc")
public class UserJDBC {

   /* @Autowired
    @Qualifier("mysqlJDBC")*//*用于接口的实现类*/
    @Resource(name="mysqlJDBC")
    private JDBC jdbc;

    public void printjdbc(){
        jdbc.print();
    }
}
