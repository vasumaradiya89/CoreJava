package test;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 25-09-2017.
 */
public class StringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String x,y="";

        System.out.println("Enter the string : ");
        x=sc.nextLine();
        //without use of reverse
        int l=x.length();

        for(int i=l-1;i>=0;i--){

            y=y+x.charAt(i);
        }
        System.out.println("Reverse String is : "+y);

        //with use of reverse
        String reverse = new StringBuffer(x).reverse().toString();
        System.out.println("\nString before reverse: "+x);
        System.out.println("String after reverse: "+reverse);
    }

}
