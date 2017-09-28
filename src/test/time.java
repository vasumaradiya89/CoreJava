package test;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 25-09-2017.
 */
public class time {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Value : ");
        int x=sc.nextInt();

        int hours = x / 3600;
        int minutes = (x % 3600) / 60;
        int seconds = (x % 3600) % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
