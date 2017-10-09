package String;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 06-10-2017.
 */
public class StringTrim
    {
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            System.out.println("Before trim : ");
            String a;
            a = sc.next().trim();
            System.out.println("After trim : ");
            System.out.println(a);

        }
}
