import java.util.Scanner;
 public class Calculator {
     public static void main(String[] args) {

         {
             Scanner scanner = new Scanner(System.in);
             System.out.println("enter the first num ");
             int firstnum = scanner.nextInt();
             System.out.println("enter the second num ");
             int secondnum = scanner.nextInt();
             int sum = (firstnum + secondnum);
             System.out.println("Addition of two numbers " + sum);//adding numbers
             int subtraction =(firstnum-secondnum);
             System.out.println("Subtraction of two numbers" + subtraction);
             int multiplication =(firstnum * secondnum);
             System.out.println("product of two numbers" + multiplication);
             float division =(firstnum/secondnum);
             System.out.println("division of two numbers"+ division);

         }

         }
     }










