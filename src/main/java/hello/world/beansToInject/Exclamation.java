package hello.world.beansToInject;

import hello.world.qualifiers.SymbolQualifier;

import javax.inject.Singleton;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/16/2019.
 * Project: hello-world
 * *******************************
 */
@Singleton
@SymbolQualifier
public class Exclamation implements Punctuation {
    @Override
    public String getSymbol() {
        return "!";
    }
}
