class Sum_Square_Difference {
    public static void main(String[] args) {
        long square = 0;
        long sum = 0;
        for (long i = 1; i <= 100; i++) {
            square += (i * i);
        }
        for (long j = 1; j <= 100; j++) {
            sum += j;
        }
        sum *= sum;
        System.out.println(
                "Difference between the sum of the squares of the first hundred natural numbers and the square of the sum :- "
                        + (sum - square));
    }
}

/* Problem 06 */