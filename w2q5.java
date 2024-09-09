import java.util.Scanner;

class w2q5 {
    public static void main(String[] args) {
        int x1=1;
        int x2= 2;
        int y1= 3;
        int y2=4;
        int x, y;
        double dist;
         x = x2 - x1;
        y = y2 - y1;
        dist = Math.sqrt(x * x + y * y);
     System.out.println("Distance between two points = " + dist);
    }
}
