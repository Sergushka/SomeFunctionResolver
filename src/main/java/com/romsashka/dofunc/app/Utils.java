package com.romsashka.dofunc.app;

import java.util.*;

public class Utils {
    private static List<SimpleResolver> variations = new ArrayList<>();

    public static String doFunc(String name, String text) {
        SimpleResolver wrongOne = new WrongFunctionReturner();
        if (name == null || name.isEmpty()) return wrongOne.doSomething(text);
        addVariations();

        int i;

        try {
            i = Integer.parseInt(name) - 1;
        } catch (NumberFormatException e) {
            return wrongOne.doSomething(text);
        }

        return variations.get(i).doSomething(text);
    }

    static class CapitalizationUtil implements SimpleResolver {
        @Override
        public String doSomething(String text) {
            return text.toUpperCase();
        }
    }

    static class FistWordReturner implements SimpleResolver {
        @Override
        public String doSomething(String text) {
            final String[] words = text.split(" ");
            if (words.length > 0) {
                return words[0];
            }
            return "Wrong input";
        }
    }

    static class WrongFunctionReturner implements SimpleResolver {

        @Override
        public String doSomething(String text) {
            return "This is not supposed to be in the console";
        }
    }

    private static void addVariations() {
        variations.add(new CapitalizationUtil());
        variations.add(new FistWordReturner());
        variations.add(new WrongFunctionReturner());
    }


    private static String getFirst(String text) {
        if (text == null || text.isEmpty()) return "";
        return text.split(" ")[0];
    }

    private static String exit() {
        return "Function is  undefined";
    }
}
