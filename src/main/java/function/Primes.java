package function;

public class Primes {
    private final int numberOfPrimes = 1000;
    private final int linesPerPage = 50;
    private final int columns = 4;
    private final int ordmax = 30;

    public void main(String[] args) {
        int[] primes = new PrimesGenerator(numberOfPrimes, ordmax).invoke();
        new PrimesPrinter(numberOfPrimes, primes).invoke(linesPerPage, columns);
    }


}
