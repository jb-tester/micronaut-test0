package hello.world;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/16/2019.
 * Project: hello-world
 * *******************************
 */
@Client("/hello")  // todo: check the 'Either the id or value of the @Client annotation must be specified' error
public interface HomeClient {

    @Get("/world")
    Single<String> foo();
    @Get("/guest/${myprops.bar-prop}")
    Single<String> bar();
}
