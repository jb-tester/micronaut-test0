package hello.world.beansToInject;

import javax.inject.Singleton;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/16/2019.
 * Project: hello-world
 * *******************************
 */
@Singleton
//@Primary
public class Empty implements MyDecorator {
    @Override
    public String getDecor() {
        return "";
    }
}
