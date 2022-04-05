package function;


public class Printer {
    private int numberOfPrimes;
    private int linesPerPage;
    private int columns;
    private int[] primes;

    public Printer(int numberOfPrimes, int linesPerPage, int columns, int... primes) {
        this.numberOfPrimes = numberOfPrimes;
        this.linesPerPage = linesPerPage;
        this.columns = columns;
        this.primes = primes;
    }

    public void invoke() {
        int pagenumber = 1;
        int pageoffset = 1;

        while (pageoffset <= numberOfPrimes) {
            System.out.println("The First " + numberOfPrimes +
                    " Prime Numbers --- Page " + pagenumber);
            System.out.println("");
            for (int rowoffset = pageoffset; rowoffset < pageoffset + linesPerPage; rowoffset++) {
                for (int column = 0; column < columns; column++)
                    if (rowoffset + column * linesPerPage <= numberOfPrimes)
                        System.out.format("%10d", primes[rowoffset + column * linesPerPage]);
                System.out.println("");
            }
            System.out.println("\f");
            pagenumber = pagenumber + 1;
            pageoffset = pageoffset + linesPerPage * columns;
        }
    }
}
