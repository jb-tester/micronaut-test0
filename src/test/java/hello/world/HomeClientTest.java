package hello.world;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/16/2019.
 * Project: hello-world
 * *******************************
 */
@MicronautTest
class HomeClientTest {
 @Inject
 HomeClient client;

    @Test
    void testFooClient() {
        assertEquals("hello, world!", client.foo().blockingGet());
    }
    @Test
    void testBarClient() {
        assertEquals("hello, user!", client.bar().blockingGet());
    }
}
