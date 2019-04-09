import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test {

    @org.junit.Test
    public void configurationTest() throws IOException {
        String resource = "mybatis-config.xml";//mybatis-config.xml路径
        InputStream inputStream = Resources.getResourceAsStream(resource);//输入流

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        System.out.println(sqlSessionFactory);
    }



}
