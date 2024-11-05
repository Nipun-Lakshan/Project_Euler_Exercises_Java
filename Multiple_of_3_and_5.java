class Multiple_of_3_and_5 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }
        }
        System.out.println("Sum of all the multiples of 3 and 5 :- " + total);
    }
}

/* Problem 01 */