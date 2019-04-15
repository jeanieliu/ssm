package com.neuedu.jdbc;

import org.springframework.stereotype.Service;

@Service("oracleJDBC")
public class OracleJDBC implements JDBC {
    public void print() {
        System.out.println("oracle实现jdbc");
    }
}
