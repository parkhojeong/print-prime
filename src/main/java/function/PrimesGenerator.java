package function;

class PrimesGenerator {

    private int[] primes;
    private int candidate;
    private int primeIndex;
    private boolean possiblyPrime;
    private int ord = 2;
    private int square = 9;
    private int n;
    private int[] multiples;

    public int[] invoke(int numberOfPrimes, int ordmax) {
        primes = new int[numberOfPrimes + 1];
        multiples = new int[ordmax + 1];
        candidate = 1;
        primeIndex = 1;
        primes[1] = 2;
        while (primeIndex < numberOfPrimes) {
            do {
                candidate = candidate + 2;
                if (candidate == square) {
                    ord = ord + 1;
                    square = primes[ord] * primes[ord];
                    multiples[ord - 1] = candidate;
                }
                n = 2;
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
