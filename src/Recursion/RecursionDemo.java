package Recursion;

/**
 * Created by Vasu Maradiya on 10-10-2017.
 */
public class RecursionDemo
{
    static int count=0;
    static void getdata()
    {
        if(count<=5)
        {
            System.out.println("Hello");
            count++;
            getdata();
        }
    }

    public static void main(String[] args) {
        getdata();
    }
}
