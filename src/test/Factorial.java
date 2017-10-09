package test;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 07-10-2017.
 */
public class Factorial
    {
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            int f=1;
            System.out.println("Enter the Number : ");
            int n=sc.nextInt();

            for (int i=1;i<=n;i++){

                f=f*i;
            }
            System.out.println(f);



        }
    }
