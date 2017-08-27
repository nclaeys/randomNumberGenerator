package be.axxes.testApp;

import static java.lang.System.out;

public class App {
    public static void main(String[] args) {
        new NumberGenerator().generate(10, 100)
                             .forEach(random -> out.println("NextRandom: " + random));
    }
}
