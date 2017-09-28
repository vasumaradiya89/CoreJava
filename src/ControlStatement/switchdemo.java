package ControlStatement;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 28-09-2017.
 */
public class switchdemo
{
    public static void main(String[] args) {

        int age;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Age : ");
        age=sc.nextInt();

        switch (age){

            case 18:
                System.out.println("Your age between 18-30.");
                break;
            case 30:
                System.out.println("Your age between 30-50.");
                break;
            case 50:
                System.out.println("your age between 50-59.");
                break;
            default:
                System.out.println("Please enter valid age.");
        }

    }


}
