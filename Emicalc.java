import java.util.Scanner;
class Emi
{
    public static void main(String []args)
    {
        Scanner a = new Scanner(System.in);

        double principal, rate, time, emi;

        System.out.print("Enter principal: ");
        principal = a.nextFloat();

        System.out.print("Enter rate: ");
        rate = a.nextFloat();

        System.out.print("Enter time in year: ");
        time = a.nextFloat();

        rate=rate/(12*100);
        time=time*12;


        emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);

        System.out.print("Monthly EMI is= "+emi+"\n");

    }
}

