package hello.world.customScopes;

import javax.inject.Singleton;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/25/2019.
 * Project: hello-world
 * *******************************
 */
@Singleton
@Documented
@Retention(RUNTIME)
public @interface MyScope1 {
}
