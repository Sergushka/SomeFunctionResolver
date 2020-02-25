package com.romsashka.dofunc.app;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Utils {
    private Map<String, SimpleResolver> variations = new HashMap<>();

    public String doFunc(String name, String text) {
        SimpleResolver resolver = new WrongInput();
        if (name == null || name.isEmpty()) return resolver.doSomething(text);
        if (variations.get(name) != null) {
            resolver = variations.get(name);
        }
        return resolver.doSomething(text);
    }

    public void registration(String name, SimpleResolver resolver) {
        variations.put(name, resolver);
    }
}
