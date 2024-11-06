class Special_Pythagorean_Triplet {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int lhs;
        int rhs;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j <= 1000; j++) {
                for (int k = 0; k <= 1000; k++) {
                    a = i;
                    b = j;
                    c = k;
                    lhs = (a * a) + (b * b);
                    rhs = (c * c);
                    if (rhs == lhs && a + b + c == 1000) {
                        System.out.println("When a = " + a + ", b = " + b + " and c = " + c
                                + ", There is a special pythagorean triplet that " + a + " + " + b + " + " + c + " = "
                                + (a + b + c));
                        System.out.println("The product of " + a + " x " + b + " x " + c + " = " + (a * b * c));
                        return;
                    }
                }
            }
        }
    }
}

/* Problem 09 */