public class GCD {
    public static int findGCD(int num1, int num2) {
        int gcd = 1;

        // finding smallest between two numbers
        int smallest = Math.min(num1, num2);

        // finding gratest common divisor
        while(smallest >= 1) {
            if(num1%smallest == 0 && num2%smallest == 0) {
                gcd = smallest;
                break;
            }

            smallest--;
        }

        // returing gcd
        return gcd;
    }
}