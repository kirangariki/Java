import java.util.Scanner;

public class AreaofRec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of rectangle in double");
        double length = scanner.nextDouble();
        System.out.println("Enter the breadth of rectangle in double");
        double breadth = scanner.nextDouble();
        double Area = (int)(length * breadth);//type casting from double to int.
        System.out.println("Area of rectangle in integer type  " +Area);


    }
}
