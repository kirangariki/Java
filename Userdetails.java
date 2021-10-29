import java.util.Scanner;

public class Userdetails {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your name \n ");
        String username = scanner.nextLine();
        System.out.println("Enter your roll number \n");
        int rollno = scanner.nextInt();
        System.out.println("What are your interests \n");
        String hobby = scanner.next();
        System.out.println("Hey my name is \n" + username  +  "  my rollno is \n " + rollno + "  i like to  \n" +hobby);
    }
}
