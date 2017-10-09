package String;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 06-10-2017.
 */
public class StringCase
    {
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the string : ");
            String a;
            a = sc.next().toUpperCase();
            System.out.println(a);

            System.out.println("Enter the string : ");
            String b;
            b=sc.next().toLowerCase();
            System.out.println(b);

        }
}
