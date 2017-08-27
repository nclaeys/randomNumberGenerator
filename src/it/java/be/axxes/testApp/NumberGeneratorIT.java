package be.axxes.testApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class NumberGeneratorIT {

    @Parameterized.Parameters
    public static Collection<Integer> data() {
        return IntStream.range(1,1000).boxed().collect(Collectors.toList());
    }

    @Parameterized.Parameter
    public Integer maxValue;

    @Test
    public void verifyMax() throws Exception {
        List<Integer> generatedList = new NumberGenerator().generate(10, maxValue);

        assertThat(generatedList).allSatisfy(number -> assertThat(number).isBetween(0, maxValue));
    }
}