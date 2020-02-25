package com.romsashka.dofunc.app;

import org.springframework.stereotype.Component;

@Component
class FirstWord implements SimpleResolver {
    @Override
    public String doSomething(String text) {
        final String[] words = text.split(" ");
        if (words.length > 0) {
            return words[0];
        }
        return "Wrong input";
    }

    @Override
    public String getName() {
        return "2";
    }
}
