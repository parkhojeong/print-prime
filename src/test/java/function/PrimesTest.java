package function;

import org.junit.Test;

import java.io.IOException;

public class PrimesTest {
    @Test
    public void
    makeSureMatchesGold() throws IOException {
        new Primes().main(new String[0]);
    }
}
