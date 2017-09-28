package test;

/**
 * Created by Vasu Maradiya on 26-09-2017.
 */
public class ThisDemo3
{
    //to pass as an argument in the method
    void display(ThisDemo3 thisDemo3)
    {
        System.out.println("Welcome");
    }
    void get()
    {
        display(this);
    }

    public static void main(String[] args) {

        ThisDemo3 this3=new ThisDemo3();
        this3.get();
    }
}
