package hello.world.confProperties;

import io.micronaut.context.annotation.ConfigurationProperties;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/19/2019.
 * Project: hello-world
 * *******************************
 */
@ConfigurationProperties("myprops")
public class MyProperties {

    String fooProp;
    String barProp;

    public String getBarProp() {
        return barProp;
    }

    public void setBarProp(String barProp) {
        this.barProp = barProp;
    }

    public String getFooProp() {
        return fooProp;
    }

    public void setFooProp(String fooProp) {
        this.fooProp = fooProp;
    }
}
