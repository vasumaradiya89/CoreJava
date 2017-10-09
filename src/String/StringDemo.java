package String;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 05-10-2017.
 */
public class StringDemo
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name :");
        String a=sc.next();
        System.out.println("Enter the name :");
        String b=sc.next();
        // == is compare the address
        if(a == b){
            System.out.println("Same name");
        }
        else {
            System.out.println("Different name");
        }

        //.equals is compare the value in side that addresskl
        if(a.equals(b)){
            System.out.println("Same name");
        }
        else {
            System.out.println("Different name");
        }
    }
}
