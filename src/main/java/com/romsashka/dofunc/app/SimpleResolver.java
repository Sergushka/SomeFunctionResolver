package com.romsashka.dofunc.app;

import org.springframework.beans.factory.annotation.Autowired;

public interface SimpleResolver {
    String doSomething(String text);
    String getName();

    @Autowired
    default void regName(Utils utils) {
        utils.registration(getName(), this);
    }
}
