package String;

import java.util.Scanner;

/**
 * Created by Vasu Maradiya on 07-10-2017.
 */
public class WordCount
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String : ");
            String s = sc.nextLine();

            int count = 1;

            for (int i = 0; i < (s.length()-1); i++)
            {
                if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
                {
                    count++;
                }
            }
            System.out.println("Number of words in a string = " + count);
        }
    }
