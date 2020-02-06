package hello.world;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/16/2019.
 * Project: hello-world
 * *******************************
 */
@MicronautTest(packages = "hello.world", application = Application.class)
public class NewControllerTest {
    @Inject
    EmbeddedServer server;

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    void testMethod1Response() {
        String response = client.toBlocking()
                .retrieve(HttpRequest.GET("/new/method1/boo"));
        assertEquals("method1 boo", response); //)
    }
    @Test
    void testMethod2Response() {
        String response = client.toBlocking()
                .retrieve(HttpRequest.GET("/new/method2/foo/bar9"));
        assertEquals("method2 foo bar9", response); //)
    }
}
