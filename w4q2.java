import java.util.Scanner;

public class w2q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        
        int[] arr = new int[n];

       
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate the sum of all elements in the array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        
        System.out.println("The sum of all array elements is: " + sum);

        sc.close();  
    }
}

