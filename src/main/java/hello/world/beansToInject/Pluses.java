package hello.world.beansToInject;

import io.micronaut.context.annotation.Secondary;

import javax.inject.Singleton;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/16/2019.
 * Project: hello-world
 * *******************************
 */
@Singleton
@Secondary
public class Pluses implements MyDecorator {
    @Override
    public String getDecor() {
        return "+++";

    }
}
