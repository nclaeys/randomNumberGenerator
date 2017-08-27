package be.axxes.testApp;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NumberGenerator {
    public List<Integer> generate(int amount, int maxNumber) {
        Random random = new Random();
        return IntStream.range(0, amount)
                 .mapToObj(any -> random.nextInt(maxNumber))
                 .collect(toList());
    }

    public List<Integer> generateEvenNumbers(int maxNumber) {
        return generate(100, 100);
    }
}
