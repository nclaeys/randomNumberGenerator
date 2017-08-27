package be.axxes.testApp;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class NumberGeneratorTest {
    @Test
    public void generateCorrectNumberOfEntries() throws Exception {
        int size = 10;

        List<Integer> generatedList = new NumberGenerator().generate(size, 100);

        assertThat(generatedList).hasSize(size);
    }

    @Test
    public void generateNumbersSmallerThanMax() throws Exception {
        int size = 10;

        List<Integer> generatedList = new NumberGenerator().generate(size, 100);

        assertThat(generatedList).allSatisfy(number -> assertThat(number).isBetween(0, 100));
    }

    @Test
    public void generateEvenNumbers() throws Exception {
        List<Integer> generatedList = new NumberGenerator().generateEvenNumbers(100);

        assertThat(generatedList).allSatisfy(number -> assertThat(number % 2).isEqualTo(0));

    }
}