import java.util.Scanner;

public class w4q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int sum = 0;

        
        while (number != 0) {
            sum += number % 10; 
            number = number / 10; 
        }

        
        System.out.println("The sum of the digits is: " + sum);

        sc.close();  
    }
}

