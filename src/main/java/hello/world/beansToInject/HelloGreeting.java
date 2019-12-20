package hello.world.beansToInject;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/16/2019.
 * Project: hello-world
 * *******************************
 */
@Singleton() //@Named("hello")
public class HelloGreeting implements Greeting {
    @Override
    public String getMessage() {
        return "hello";
    }
}
