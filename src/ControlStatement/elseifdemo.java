package ControlStatement;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 28-09-2017.
 */
public class elseifdemo
{
    public static void main(String[] args) {

    int n;
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age : ");
        n=sc.nextInt();

        if(n>=18 && n<=30)
        {
            System.out.println("Your age between 18-30.");
        }
        else if(n>=30 && n<=50)
        {
            System.out.println("your age between 30-50.");
        }
        else if(n>=50 && n<=60)
        {
            System.out.println("Your age above 50.");
        }
    }
}
