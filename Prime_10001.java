class Prime_10001 {
    public static void main(String[] args) {
        int count = 0;
        long i;
        for (i = 2; i >= 0; i++) {
            boolean isPrime = true;
            if (i == 2) {
                isPrime = true;
            }
            if (i > 2) {
                for (long j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime == true) {
                count += 1;
            }
            if (count == 10001) {
                break;
            }
        }
        System.out.println("The 10001st Prime :- " + i);
    }
}

/* Problem 07 */