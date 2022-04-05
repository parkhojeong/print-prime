package function;

class PrimesGenerator {

    private int square = 9;
    private int numberOfPrimes;
    private int ordmax;

    public PrimesGenerator(int numberOfPrimes, int ordmax) {
        this.numberOfPrimes = numberOfPrimes;
        this.ordmax = ordmax;
    }

    public int[] invoke() {
        int[] primes = new int[numberOfPrimes + 1];
        int[] multiples = new int[ordmax + 1];
        int candidate = 1;
        int primeIndex = 1;
        int ord = 2;
        primes[1] = 2;
        while (primeIndex < numberOfPrimes) {
            boolean possiblyPrime;
            do {
                candidate = candidate + 2;
                if (candidate == square) {
                    ord = ord + 1;
                    square = primes[ord] * primes[ord];
                    multiples[ord - 1] = candidate;
                }
                int n = 2;
                possiblyPrime = true;
                while (n < ord && possiblyPrime) {
                    while (multiples[n] < candidate)
                        multiples[n] = multiples[n] + primes[n] + primes[n];
                    if (multiples[n] == candidate)
                        possiblyPrime = false;
                    n = n + 1;
                }
            } while (!possiblyPrime);
            primeIndex = primeIndex + 1;
            primes[primeIndex] = candidate;
        }
        return primes;
    }

}
