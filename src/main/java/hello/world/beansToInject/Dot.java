package hello.world.beansToInject;

import javax.inject.Singleton;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/16/2019.
 * Project: hello-world
 * *******************************
 */
@Singleton
public class Dot implements Punctuation {
    @Override
    public String getSymbol() {
        return ".";
    }
}
