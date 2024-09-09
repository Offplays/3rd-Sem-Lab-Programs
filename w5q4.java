import java.util.Scanner;

public class w5q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }
        
        int[] array = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        int min = array[0];
        int max = array[0];
        
        
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}

