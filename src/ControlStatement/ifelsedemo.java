package ControlStatement;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 28-09-2017.
 */
public class ifelsedemo
{
    public static void main(String[] args) {

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        n=sc.nextInt();

        if(n%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}
