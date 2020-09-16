import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int input = Integer.parseInt(binary);
        int man = 1;
        int result = 0;
    
        while(input > 0) {
            result += (input % 10) * man;
            input /= 10;
            man *= 2;
        }

        return result;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a binary number: ");
        String input = scan.next();
        System.out.println("The decimal equivalent to " + input + " is " + binaryToDecimal(input));

        scan.close();
    }
}
