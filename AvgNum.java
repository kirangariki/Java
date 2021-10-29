

import java.util.Scanner;

class Average {
    int n1;
    int n2;
    public void calcAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the score for the first subject ");
            int n1=scanner.nextInt();
        System.out.println("enter the score for second subject");
            int n2=scanner.nextInt();
            float Avg=(n1+n2)/2;
        System.out.println("Average of  numbers is" + Avg);
    }
}
public class AvgNum {
    public static void main(String[] args) {
        Average obj1 = new Average();
        obj1.calcAverage();

    }
}
