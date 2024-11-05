class Largest_Palindrome_Number {
    public static int number = 0;
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            for (int j = i; j <= 999; j++) {
                int temp = i * j;
                int temp2 = temp;
                int reverse = 0;
                while (temp != 0) {
                    int temp1 = (temp % 10);
                    reverse = (reverse * 10) + temp1;
                    temp /= 10;
                }
                if (temp2 == reverse && temp2 > number) {
                    number = temp2;
                }
            }
        }
        System.out.println("The Largest Palindrome Number :- " + number);
    }
}
/* Problem 04 */