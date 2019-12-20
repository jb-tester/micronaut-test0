package hello.world.beansToInject;

import io.micronaut.context.annotation.*;

import javax.inject.Singleton;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/16/2019.
 * Project: hello-world
 * *******************************
 */
@Singleton
//@Prototype
//@Context
//@Infrastructure        // todo: check that infrastructure bean can't be replaced
@Primary
public class FooImpl implements Foo {
    @Override
    public String getId() {
        return "foo1";
    }
}
