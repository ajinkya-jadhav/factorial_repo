import java.util.Scanner;
import java.lang.Math;

class factorial {

    public static int calculate(int x) {
        if (x < 1) {
            return 0;
        }

        int f = 1;

        while (x != 1) {
            f *= x;
            x -= 1;
        }
        return f;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = sc.nextInt();

        int f = factorial.calculate(x);

        System.out.println("The factorial of " + x + " is: " + f);
    }
}
