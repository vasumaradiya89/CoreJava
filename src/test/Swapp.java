package test;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 25-09-2017.
 */
public class Swapp {

        static int temp;

    public static void main(String[] args) {
        //without third number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of X : ");
        int X=sc.nextInt();
        System.out.println("Enter the value of Y : ");
        int Y=sc.nextInt();

        X=X+Y;
        Y=X-Y;
        X=X-Y;
        /*
        //with help of third number

        temp=X;
        X=Y;
        Y=temp;
        */

        System.out.println("Value of X is : "+X);
        System.out.println("Valie of Y is :"+Y);
    }
}
