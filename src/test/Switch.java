package test;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 26-09-2017.
 */
public class Switch
{
    static int c;
    void Add()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a=Sc.nextInt();
        System.out.println("Enter the value of b :");
        int b=Sc.nextInt();
        c=a+b;
        System.out.println("Addition of two number is :"+c);
    }
    void Sub()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a=Sc.nextInt();
        System.out.println("Enter the value of b :");
        int b=Sc.nextInt();
        c=a-b;
        System.out.println("Subtraction of two number is :"+c);
    }
    void Multi()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a=Sc.nextInt();
        System.out.println("Enter the value of b :");
        int b=Sc.nextInt();
        c=a*b;
        System.out.println("Multiplication of two number is :"+c);
    }
    void Div()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a=Sc.nextInt();
        System.out.println("Enter the value of b :");
        int b=Sc.nextInt();
        c=a/b;
        System.out.println("Division of two number is :"+c);
    }
    void Mod()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a=Sc.nextInt();
        System.out.println("Enter the value of b :");
        int b=Sc.nextInt();
        c=a%b;
        System.out.println("Modulo of two number is :"+c);
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);

        Switch add=new Switch();
        Switch sub=new Switch();
        Switch multi=new Switch();
        Switch div=new Switch();
        Switch modul=new Switch();

        System.out.println("Enter the choise :");
        int x=Sc.nextInt();
        switch(x)
        {

            case 1:
            {
                add.Add();
            }
            break;

            case 2:
            {
                sub.Sub();
            }
            break;

            case 3:
            {
                multi.Multi();
            }
            break;

            case 4:
            {
                div.Div();
            }
            break;

            case 5:
            {
                modul.Mod();
            }
            break;

            default: {
                System.out.println("No Error");
            }

        }
        if(c%2 == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
        if(c<=25)
        {
            System.out.println("Number is small");
        }
        else if(c>=25 && c<50)
        {
            System.out.println("Number is medium");
        }
        else if(c>=50 && c<75)
        {
            System.out.println("Number is large");
        }
        else if(c>=75 && c>=100)
        {
            System.out.println("Number is Extra large");
        }
    }
}


