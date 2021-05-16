package de.compare.java.springboot;

import org.hamcrest.core.IsNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    RestController restController;

    private final static String HELLO = "Hello World!";

    @Test
    void contextLoads() {
        assertThat(restController, is(IsNull.notNullValue()));
        assertThat(HELLO, equalTo(restController.hello()));
    }

}