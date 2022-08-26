

import java.util.Scanner;
/** @author Mohyla Sofiia */
public class Main {
    public static void main(String[] args) {
        /**
         * Generates a sequence of Lucas Numbers and
         * check if they can be represented  as w^3 - 1
         * @param n amount of Lucas Numbers to be generated
         */
        Scanner scanner = new Scanner(System.in);
        LucasNumbers LucasNumb = new LucasNumbers();
        long a = 2, b = 1;
        double res;
        int n;

        System.out.print("Enter the number of Lucas Numbers: ");
        n = scanner.nextInt();
        if (n<=0)
            throw new IllegalArgumentException();
        res = Math.cbrt(a + 1);
        if (res % 1 == 0)
            System.out.println("Number[" + 1 + "] = " + a + " Res = " + (long) res);
        res = Math.cbrt(b + 1);
        if (res % 1 == 0)
            System.out.println("Number[" + 2 + "] = " + b + " Res = " + (long) res);

        for (int i = 0; i < n; i++) {
            LucasNumb.NextValue(a + b);
            a = b;
            b = LucasNumb.GetValue();
            res = Math.cbrt(LucasNumb.GetValue() + 1);
            if (res % 1 == 0)
                System.out.println("Number[" + LucasNumb.GetNumber() + "] = " + LucasNumb.GetValue() + " Res = " + (long) res);
        }
    }
}
