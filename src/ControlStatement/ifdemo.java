package ControlStatement;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 28-09-2017.
 */
public class ifdemo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number :" );
        int n=sc.nextInt();

        if(n != 0)
        {
            System.out.println(n);
        }
    }
}
