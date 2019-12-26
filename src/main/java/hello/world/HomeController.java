package hello.world;

import hello.world.beansToInject.*;
import hello.world.confProperties.MyProperties;
import hello.world.confProperties.MyPropertiesExtended;
import hello.world.qualifiers.SymbolQualifier;
import io.micronaut.context.annotation.Value;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/16/2019.
 * Project: hello-world
 * *******************************
 */
@Controller("/hello")
public class HomeController {

    @Inject
    List<Foo> fooList;

    @Inject
    Foo[] fooArray;

    @Inject
    Provider<Foo> fooProvider;

    @Inject
    CustomScopedBean customScopedBean;

    @Inject  // todo: primary bean is not used as a single candidate on navigation; secondary-annotated ones are used
            //   as non-secondary ones
            MyDecorator decorator;

    @Inject @Named("${myprops.ext.boo}") // todo: no completion for bean names; no navigation to single matching bean
            Greeting greeting;

    @Inject
    @SymbolQualifier // todo: qualified bean is not used as single candidate on navigation
            Punctuation symbol;

    // configuration properties:
    @Inject
    MyProperties myProperties;
    @Inject
    MyPropertiesExtended extProperties;

    @Value("${myprops.ext.bar-prop:`vvv`}")
    String vvv;

    @Get("/guest/${myprops.bar-prop}")
    public String bar() {
        return decorator.getDecor() + greeting.getMessage() + ", user" + symbol.getSymbol() + decorator.getDecor();
    }

    @Get("/world")
    public String foo() {
        System.out.println("foo list:");
        for (Foo foo : fooList) {
            System.out.println(foo.getId());
        }
        System.out.println("foo array:");
        for (Foo foo : fooArray) {
            System.out.println(foo.getId());
        }
        System.out.println("foo provider:");
        System.out.println(fooProvider.get().getId());
        System.out.println("custom config property usages:");
        System.out.println(myProperties.getFooProp());
        System.out.println(extProperties.getBoo());
        System.out.println(this.vvv);
        return decorator.getDecor()+greeting.getMessage()+", world"+symbol.getSymbol()+decorator.getDecor();
    }
}
