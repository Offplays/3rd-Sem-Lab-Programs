import java.util.Scanner;

public class w3q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();  

       
        while (number >= 10) {
            number = number / 2;
            System.out.println("Current value: " + number);
        }

        sc.close();  
    }
}
