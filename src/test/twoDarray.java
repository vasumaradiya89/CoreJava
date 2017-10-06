package test;

/**
 * Created by Vasu Maradiya on 25-09-2017.
 */

import java.util.Scanner;

public class twoDarray {

    static int r,c,d,b,a;
    void Arrry(){

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter array size : ");
        d=scanner.nextInt();
        b=scanner.nextInt();

        int [][] a=new int[d][b];
       System.out.println("Enter number of rows: ");

        r = scanner.nextInt();

        System.out.println ("Enter the number of columns: ");

        c = scanner.nextInt();

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++)
            {
                System.out.println("Enter the number for row " + i + " and column " + j + " : ");
                a [i][j] = scanner.nextInt();
            }

        }
        System.out.print("The Array is :\n");

        for(int i=0; i<r; i++)
        {

            for(int j=0; j<c; j++)
            {
                System.out.print(a[i][j]+ "  ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        twoDarray arr=new twoDarray();
        arr.Arrry();

    }

}
