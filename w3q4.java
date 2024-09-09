import java.util.Scanner;

public class w3q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        
        int sum = 0;

       
        for (int i = 1; i <= N; i++) {
            sum += i;  
        }

      
        System.out.println("The sum of the series 1 + 2 + 3 + ... + " + N + " is: " + sum);

        sc.close();  
    }
}


