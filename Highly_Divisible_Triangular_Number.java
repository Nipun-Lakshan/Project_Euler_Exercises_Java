class Highly_Divisible_Triangular_Number {
    public static void main(String[] args) {
        int i = 1;
        int triangularNumber = 0;
        while (true) {
            triangularNumber += i;
            i++;
            int count = countDivisors(triangularNumber);
            if (count > 500) {
                System.out.println("The first triangular number with over 500 divisors is :- " + triangularNumber);
                break;
            }
        }
    }

    public static int countDivisors(int number) {
        int divisors = 0;
        int sqrt = (int) Math.sqrt(number);
        for (int i = 1; i <= sqrt; i++) {
            if (number % i == 0) {
                divisors += 2;
            }
        }
        if (sqrt * sqrt == number) {
            divisors--;
        }
        return divisors;
    }
}
/* Problem 12 */