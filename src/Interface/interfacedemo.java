package Interface;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 04-10-2017.
 */
public interface interfacedemo
    {
        void add();
        void sub();
        void multi();
    }
class interdoem1 implements interfacedemo{


    public void add() {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the a : ");
        a=sc.nextInt();
        System.out.println("Enter the b : ");
        b=sc.nextInt();
        c=a+b;
        System.out.println("Ans is : "+c);

    }


    public void sub() {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the a : ");
        a=sc.nextInt();
        System.out.println("Enter the b : ");
        b=sc.nextInt();
        c=a-b;
        System.out.println("Ans is : "+c);

    }


    public void multi() {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the a : ");
        a=sc.nextInt();
        System.out.println("Enter the b : ");
        b=sc.nextInt();
        c=a*b;
        System.out.println("Ans is : "+c);

    }

    public static void main(String[] args) {

        interfacedemo interfacedemo=new interdoem1();
        interfacedemo.add();
        interfacedemo.sub();
        interfacedemo.multi();
    }
}