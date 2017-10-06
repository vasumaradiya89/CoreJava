package Abstraction;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 04-10-2017.
 */
    abstract class Abstractdemo
    {
        abstract void add();
        abstract void sub();
        void multi(){
            Scanner sc=new Scanner(System.in);
            int a,b,c;
            System.out.println("Enter the a : ");
            a=sc.nextInt();
            System.out.println("Enter the b : ");
            b=sc.nextInt();
            c=a*b;
            System.out.println("Ans is : "+c);
        }
    }
    abstract class absdemo extends Abstractdemo{
        void add(){
            Scanner sc=new Scanner(System.in);
            int a,b,c;
            System.out.println("Enter the a : ");
            a=sc.nextInt();
            System.out.println("Enter the b : ");
            b=sc.nextInt();
            c=a+b;
            System.out.println("Ans is : "+c);
        }
        void sub(){
            Scanner sc=new Scanner(System.in);
            int a,b,c;
            System.out.println("Enter the a : ");
            a=sc.nextInt();
            System.out.println("Enter the b : ");
            b=sc.nextInt();
            c=a-b;
            System.out.println("Ans is : "+c);
        }
    }
    class adsdemo1 extends absdemo{
        public static void main(String[] args) {
            Abstractdemo abstractdemo=new adsdemo1();
            abstractdemo.add();
            abstractdemo.sub();
            abstractdemo.multi();
        }
    }