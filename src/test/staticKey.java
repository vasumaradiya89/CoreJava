package test;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 25-09-2017.
 */
public class staticKey {

    static int a,b;
    static int c=0;
    static int temp;

    static  void arm()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value : ");
            a = sc.nextInt();
            temp = a;
            while (a > 0) {
                b = a % 10;
                a = a / 10;
             // c=0;
                c = c+(b * b * b);}
            System.out.println(a);
            System.out.println(temp);
            System.out.println(c);
            if (temp == c) {
                System.out.println("Number is armstrong");
            } else {
                System.out.println("Number is not armstrong");
            }
        }
    static
        {
            System.out.println("Here block is static");
           // arm();
        }
    staticKey()
        {
            System.out.println("Welcome to codekul");
            arm();
        }

    public static void main(String[] args)
        {
            staticKey sk=new staticKey();
           c=0;
            sk.arm();

        }
}
