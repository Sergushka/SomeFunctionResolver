package com.romsashka.dofunc.app;

import org.springframework.stereotype.Component;

@Component
class WrongInput implements SimpleResolver {
    @Override
    public String doSomething(String text) {
        return "This is not supposed to be in the console";
    }

    @Override
    public String getName() {
        return "3";
    }
}
