package hello.world;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller("/new")
public class NewController {

    @Get(value="/method1/{pvar1:foo[0-9]|bar[0-9]}")
    public String method1(@PathVariable("pvar1") String p){

        return "method1 "+p;
    }

    @Get("/method2/{pvar2}/{pvar3:...[0-9]}")
    public String method2(@PathVariable String pvar2, @PathVariable("pvar3") String pvar3){

        return "method2 "+pvar2+" "+pvar3;
    }
}
