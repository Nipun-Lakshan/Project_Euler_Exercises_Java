class Even_Fibonacci_Numbers {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int total = 0;
        int num3 = -1;
        while (true) {
            num3 = num1 + num2;
            if (num3 > 4000000) {
                break;
            }
            if (num3 % 2 == 0) {
                total += num3;
            }
            num1 = num2;
            num2 = num3;
        }
        System.out.println("Sum of Even Fibonacci Numbers Below 4 Million :- " + total);
    }
}
/* Problem 02 */