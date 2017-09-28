package test;

/**
 * Created by Vasu Maradiya on 25-09-2017.
 */
public class flag {

    public static void main(String[] args)
    {

        String a = "* * * * * * =============================\n * * * * *  =============================";
        String b = "=========================================";
        for(int i=0; i<2; i++){
            System.out.println(a);
        }
        System.out.println("* * * * * * =============================");
        for(int i=0; i<5; i++){
            System.out.println(b);
        }
    }
}
