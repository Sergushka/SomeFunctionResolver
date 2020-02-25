package com.romsashka.dofunc;

import com.romsashka.dofunc.app.Utils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DofuncApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DofuncApplication.class, args);
        Utils utils = context.getBean(Utils.class);
        System.out.println(utils.doFunc("1", "Arnold is cool"));
    }


}
