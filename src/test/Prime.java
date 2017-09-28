package test;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 26-09-2017.
 */
public class Prime {

    public static void main(String[] args)
    {
        int n,m=0,f=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        n=sc.nextInt();
        m=n/2;
        for(int i=2;i<=m;i++)
        {
            if (n % i == 0) {
                System.out.println("Number is Prime");
                f = 1;
                break;
            }
            if (f == 0) {
                System.out.println("Number is not Prime");
            }
        }
    }
}
