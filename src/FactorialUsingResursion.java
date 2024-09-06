import java.util.Scanner;

public class FactorialUsingResursion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int x = scanner.nextInt();

        System.out.printf("Factorial of %d is %d%n", x, getFactorial(x));
        
    }

    public static long getFactorial(int x) {

        if(x < 0)
            return -1;
            
        if(x == 0)
            return 1;

        return x * getFactorial(x-1);
    }
}
