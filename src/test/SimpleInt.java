package test;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 26-09-2017.
 */
public class SimpleInt
{
    static float z;
    void Simple()
    {
        float p,r;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of p :");
        p=sc.nextFloat();
        System.out.println("Enter the value of r :");
        r=sc.nextFloat();
        System.out.println("Enter the value of n :");
        n=sc.nextInt();
        z=(p*r*n)/100;
        System.out.println("Value of I is : "+z);
    }
    void Square()
    {
        float a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a :");
        a=sc.nextFloat();
        z=a*a;
        System.out.println("Value of I is : "+z);
    }
    void Circle()
    {
        float r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of r :");
        r=sc.nextFloat();
        z=(float) ((3.14)*r*r);
        System.out.println("Value of I is : "+z);
    }
    void Sphere()
    {
        float r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of r :");
        r=sc.nextFloat();
        z=(float) (4*3.14*r*r);
        System.out.println("Value of I is : "+z);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Choise : ");
        int x=sc.nextInt();

        SimpleInt sim=new SimpleInt();
        SimpleInt sqa=new SimpleInt();
        SimpleInt cir=new SimpleInt();
        SimpleInt sph=new SimpleInt();

        switch(x)
        {

            case 1:
            {
                sim.Simple();
            }
            break;

            case 2:
            {
                sqa.Square();
            }
            break;

            case 3:
            {
                cir.Circle();
            }
            break;

            case 4:
            {
                sph.Sphere();
            }
            break;

            default:
            {
                System.out.println("No Error");
            }

        }
        float sqrt = (float) Math.sqrt(z);
        if(sqrt*sqrt == z)
        {
            System.out.println(z+" is a perfect square number!");
        }
        else
        {
            System.out.println(z+" is NOT a perfect square number!");
        }
        if(z%2 == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}
