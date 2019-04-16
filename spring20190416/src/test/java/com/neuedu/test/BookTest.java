package com.neuedu.test;

import com.neuedu.pojo.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {

    @Test
    public void  book(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book=(Book) context.getBean("book");
        book.print();
    }
}
