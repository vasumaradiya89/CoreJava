package String;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 06-10-2017.
 */
public class StringStartEnd
    {
        public static void main(String[] args) {


            String a="Vasu";
            int b=5;

            //String startsWith() and endsWith() method
            System.out.println(a.startsWith("V"));
            System.out.println(a.endsWith("u"));

            //String charAt() method
            System.out.println(a.charAt(1));
            System.out.println(a.charAt(3));

            //String length() method
            System.out.println(a.length());

            //String valueOf() method
            String s=String.valueOf(20);
            System.out.println(s+5);

            //String replace() method
            String c="Java is easy.Java is more popular.Java is more Robust";
            String s1=c .replace("Java","Aava");
            System.out.println(s1);


        }
}
