import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTest {

    @Before
    public void before(){
        System.out.println("test之前");
    }

    @After
    public void after(){
        System.out.println("test之后");
    }
    @Test
    public void print(){
        System.out.println("谁睡着了？");
    }

    @Test
    public void print2(){
        System.out.println("今天很冷！");
    }
}
