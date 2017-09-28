package test;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 26-09-2017.
 */
public class NewClass {
    static int a,b;
    void Add()
        {
            int c;
            Scanner Sc=new Scanner(System.in);
            System.out.println("Enter the value of a :");
            int a=Sc.nextInt();
            System.out.println("Enter the value of b :");
            int b=Sc.nextInt();
            c=a+b;
            System.out.println("Addition of two number is :"+c);
        }
    }
    class demo11 extends NewClass
    {
           void sub()
           {
               int d;
               Scanner Sc=new Scanner(System.in);
               System.out.println("Enter the value of a :");
               int a=Sc.nextInt();
               System.out.println("Enter the value of b :");
               int b=Sc.nextInt();
               d=a-b;
               System.out.println("Subtraction of two number is :"+d);
           }
    }
    class demo22 extends demo11
    {
            void multi()
            {
                int x;
                Scanner Sc=new Scanner(System.in);
                System.out.println("Enter the value of a :");
                int a=Sc.nextInt();
                System.out.println("Enter the value of b :");
                int b=Sc.nextInt();
                x=a*b;
                System.out.println("Multiplication of two number is :"+x);
            }
    }
    class demo33 extends demo22
    {
            void div()
            {
                int y;
                Scanner Sc=new Scanner(System.in);
                System.out.println("Enter the value of a :");
                int a=Sc.nextInt();
                System.out.println("Enter the value of b :");
                int b=Sc.nextInt();
                y=a/b;
                System.out.println("Division of two number is :"+y);
            }

        public static void main(String[] args)
            {
                demo33 dm=new demo33();
                dm.Add();
                dm.sub();
                dm.multi();
                dm.div();
            }
    }
