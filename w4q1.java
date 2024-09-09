public class w4q1 {
    public static void main(String[] args) {
        
        int[] arr = new int[10];

        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 10;
        }

        
        System.out.println("Array values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
