class Smallest_Multiple {
    public static void main(String[] args) {
        int i;
        for (i = 1; i > 0; i++) {
            boolean smallest_multiple = true;
            for (int j = 1; j <= 20; j++) {
                if (i % j != 0) {
                    smallest_multiple = false;
                    break;
                }
            }
            if (smallest_multiple == true) {
                System.out.println(
                        "The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 :- "
                                + i);
                break;
            }
        }
    }
}
/* Problem 05 */