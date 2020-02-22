package com.romsashka.dofunc;

import com.romsashka.dofunc.app.Utils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DofuncApplication {

    public static void main(String[] args) {
        SpringApplication.run(DofuncApplication.class, args);
        Utils utils = new Utils();
        System.out.println(utils.doFunc("1", "Arnold is cool"));
    }


}
