package hello.world.confProperties;

import io.micronaut.context.annotation.ConfigurationProperties;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/20/2019.
 * Project: hello-world
 * *******************************
 */
@ConfigurationProperties(value = "ext", excludes = "bar-prop")
public class MyPropertiesExtended extends MyProperties {
    String boo;

    public String getBoo() {
        return boo;
    }

    public void setBoo(String boo) {
        this.boo = boo;
    }
}
