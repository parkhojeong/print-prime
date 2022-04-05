package function;

public class PrintPrimes {
    private final int numberOfPrimes = 1000;
    private final int linesPerPage = 50;
    private final int columns = 4;
    private final int ordmax = 30;

    public void main(String[] args) {
        int[] primes = new PrintPrimesHelper().invoke(numberOfPrimes, ordmax);
        new Printer(numberOfPrimes, linesPerPage, columns, primes);
    }


}
