package com.neuedu.jdbc;

import org.springframework.stereotype.Service;

@Service("mysqlJDBC")
public class MysqlJDBC implements JDBC {
    public void print() {
        System.out.println("mysql实现jdbc");
    }
}
