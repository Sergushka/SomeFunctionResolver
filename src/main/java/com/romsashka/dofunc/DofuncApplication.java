package com.romsashka.dofunc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.romsashka.dofunc.app.Utils.doFunc;

@SpringBootApplication
public class DofuncApplication {

    public static void main(String[] args) {
        SpringApplication.run(DofuncApplication.class, args);
        System.out.println(doFunc("3", "Arnold is Cool"));
    }



}
