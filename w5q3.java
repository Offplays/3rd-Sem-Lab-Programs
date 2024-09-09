import java.util.Scanner;

public class w5q3 {
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
        
        
        if (n > 1) {
            int temp = array[0];
            array[0] = array[n - 1];
            array[n - 1] = temp;
        }
        
        
        System.out.println("Array after swapping first and last elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

