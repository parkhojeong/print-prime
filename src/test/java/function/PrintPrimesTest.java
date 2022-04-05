package function;

import org.junit.Test;

import java.io.IOException;

public class PrintPrimesTest {
    @Test
    public void
    makeSureMatchesGold() throws IOException {
        new PrintPrimes().main(new String[0]);
    }
}
