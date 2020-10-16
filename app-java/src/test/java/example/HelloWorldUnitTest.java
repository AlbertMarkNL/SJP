package example;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class HelloWorldUnitTest {

    @Test
    public void test() {
        new HelloWorld().coveredByUnitTest();
    }

    @Test
    public void test2() {
        new HelloWorld().shouldDefineConstant();
    }

    @Test
    public void test3() {
        String result = new HelloWorld().getWords(5);
        assertThat(result, equalTo("five"));
        
    @Test
        public void test4() {
        String result = new HelloWorld().getWords(6);
        assertThat(result, equalTo("six"));
        
        @Test
        public void test5() {
        String result = new HelloWorld().getWords(7);
        assertThat(result, equalTo("six"));
    }

}
