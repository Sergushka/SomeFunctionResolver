package com.romsashka.dofunc.app;

import java.util.*;

public class Utils {
    private Map<String, SimpleResolver> variations = new HashMap<>();

    public String doFunc(String name, String text) {
        SimpleResolver wrongOne = new WrongFunctionReturner();
        if (name == null || name.isEmpty()) return wrongOne.doSomething(text);
        return variations.get(name).doSomething(text);
    }

    class CapitalizationUtil implements SimpleResolver {
        @Override
        public String doSomething(String text) {
            return text.toUpperCase();
        }
    }

    class FistWordReturner implements SimpleResolver {
        @Override
        public String doSomething(String text) {
            final String[] words = text.split(" ");
            if (words.length > 0) {
                return words[0];
            }
            return "Wrong input";
        }
    }

    class WrongFunctionReturner implements SimpleResolver {

        @Override
        public String doSomething(String text) {
            return "This is not supposed to be in the console";
        }
    }

    public Utils() {
        variations.put("1", new CapitalizationUtil());
        variations.put("2", new FistWordReturner());
        variations.put("3", new WrongFunctionReturner());
    }
}
