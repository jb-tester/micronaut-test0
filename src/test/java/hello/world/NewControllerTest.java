package hello.world;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
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
        assertEquals("method1 boo", response);
    }
    @Test
    void testMethod2Response() {
        String response = client.toBlocking()
                .retrieve(HttpRequest.GET("/new/method2/foo/bar9"));
        assertEquals("method2 foo bar9", response);
    }
    @Test
    void testMethod3Response() {
        String response = client.toBlocking()
                .retrieve(HttpRequest.GET("/new/method3/foo"));
        String response2 = client.toBlocking()
                .retrieve(HttpRequest.GET("/new/method3/"));
        assertEquals("method3 foo", response);
        assertEquals("method3 null", response2);
        try {
            String response3 = client.toBlocking()
                    .retrieve(HttpRequest.GET("/new/method3/foofoo"));
        } catch (HttpClientResponseException e) {
            System.out.println("this part should fail");;
        }
    }
    @Test
    void testMethod4Response() {
        String response = client.toBlocking()
                .retrieve(HttpRequest.GET("/new/method4/boo?p1=foo&p2=bar"));
        String response2 = client.toBlocking()
                .retrieve(HttpRequest.GET("/new/method4/boo/zoo?p1=foo&p2=bar"));
        assertEquals("method4 boo/zoo foo bar", response2);
    }

    @Test
    void testMethod5Response() {
        String response = client.toBlocking()
                .retrieve(HttpRequest.GET("/new/method5/test?p1=foo&p2=bar"));

        assertEquals("method5 MyData: foo bar null", response);
    }
    @Test
    void testMethod6Response() {
        String response = client.toBlocking()
                .retrieve(HttpRequest.GET("/new/method6/test7atest"));

        assertEquals("method6 test7a", response);
    }

}
