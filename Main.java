import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inputNumbers = sc.nextLine();

        // extracting values
        List<Integer> numbers = Arrays.stream(inputNumbers.split(",")).map(Integer::parseInt).collect(Collectors.toList());

        // finding gcd using findGCD() method of GCD class
        int gcd = GCD.findGCD(numbers.get(0), numbers.get(1));

        // printing gcd of given numbers
        System.out.println(gcd);

        // closing resource
        sc.close();
    }
}