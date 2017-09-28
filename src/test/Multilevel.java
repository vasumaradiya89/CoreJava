package test;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 27-09-2017.
 */
public class Multilevel
    {
        void Square()
        {
            float a,z;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of a :");
            a=sc.nextFloat();
            z=a*a;
            System.out.println("Value of I is : "+z);
        }
    }
class Multilevel1 extends Multilevel
    {
      static   void Circle()
        {
            float r,z;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of r :");
            r=sc.nextFloat();
            z=(float) ((3.14)*r*r);
            System.out.println("Value of I is : "+z);
        }
    }
class Multilevel2 extends Multilevel
    {
        void Sphere()
        {
            float r,z;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of r :");
            r=sc.nextFloat();
            z=(float) (4*3.14*r*r);
            System.out.println("Value of I is : "+z);
        }

        public static void main(String[] args)
        {
            Multilevel2 multilevel2=new Multilevel2();
            Multilevel1 multilevel1=new Multilevel1();
            multilevel1.Square();
            multilevel2.Square();

        }
    }