class Largest_Prime_Factor {

    public static long prime_Factors[] = new long[0];
    public static long count = 0;

    public static void main(String[] args) {

        long number = 600851475143L;
        long i;
        System.out.print("The prime factors of " + number + " :- [");
        for (i = 2; i <= number; i++) {
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

            if (isPrime == true && number % i == 0) {
                System.out.print(i + ", ");
                number = number / i;
            }
        }
        System.out.println("\b\b]");
        System.out.println("Larget Prime Factor :- " + (i - 1));
    }
}