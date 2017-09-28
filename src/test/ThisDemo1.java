package test;

/**
 * Created by Vasu Maradiya on 26-09-2017.
 */
public class ThisDemo1 {
    //this: to invoke current class method
    void first()
    {
        System.out.println("welcome to codekul");
    }
    void second()
    {
        System.out.println("Hello");
        this.first();
    }

    public static void main(String[] args) {

        ThisDemo1 this1=new ThisDemo1();
        this1.second();
    }
}
