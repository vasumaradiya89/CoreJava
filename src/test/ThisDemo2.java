package test;

/**
 * Created by Vasu Maradiya on 26-09-2017.
 */
public class ThisDemo2
{
    //Calling default constructor from parameterized constructor
   ThisDemo2()
    {
        System.out.println("Hello");
    }
    ThisDemo2(String x)
    {
        this();
        System.out.println(x);
    }

    public static void main(String[] args) {
        ThisDemo2 this2=new ThisDemo2("Vasu");
    }
    //Calling parameterized constructor from default constructor

    /*ThisDemo2()
    {
     this("Welcome");
        System.out.println("Vasu");
    }
    ThisDemo2(String x)
    {
        System.out.println(x);
    }

    public static void main(String[] args) {

        ThisDemo2 this2=new ThisDemo2();
    }*/
}
