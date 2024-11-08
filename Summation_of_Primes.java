class Summation_of_Primes {
    public static void main(String[] args) {
        long total = 2;
        for (long i = 3; i <= 2_000_000; i += 2) {
            boolean isPrime = true;
            for (long j = 3; j < i; j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                total += i;
            }
        }
        System.out.println("The summation of primes below two million :- " + total);
    }
}

/* Problem 10 */