package hello.world.beansToInject;

import io.micronaut.context.annotation.Replaces;

import javax.inject.Singleton;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/16/2019.
 * Project: hello-world
 * *******************************
 */
@Singleton
//@Replaces(FooImpl.class) // todo: bean replacement seems to be not considered on navigation
public class FooImpl2 implements Foo {
    @Override
    public String getId() {

        return "foo2";
    }
}
