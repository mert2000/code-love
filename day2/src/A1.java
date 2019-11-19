import java.util.Scanner;

public class A1 {
    public static void main (String args[]) {
        int a;
        System.out.println("Write a number:");
        Scanner sc = new Scanner(System.in);
        a=Integer.parseInt(sc.nextLine());
        if(a>0)
        {
            System.out.println("The number"+a+"is positive");
        }
        else
            {
                System.out.println("The number"+a+"123123is negative");
            }

    }
}

