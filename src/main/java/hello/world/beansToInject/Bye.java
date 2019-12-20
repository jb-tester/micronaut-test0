package hello.world.beansToInject;

import javax.inject.Singleton;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/16/2019.
 * Project: hello-world
 * *******************************
 */
@Singleton
public class Bye implements Greeting {
    @Override
    public String getMessage() {
        return "bye-bye";
    }
}
