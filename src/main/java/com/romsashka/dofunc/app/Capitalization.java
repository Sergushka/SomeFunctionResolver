package com.romsashka.dofunc.app;

import org.springframework.stereotype.Component;

@Component
class Capitalization implements SimpleResolver {
    @Override
    public String doSomething(String text) {
        return text.toUpperCase();
    }

    @Override
    public String getName() {
        return "1";
    }
}
