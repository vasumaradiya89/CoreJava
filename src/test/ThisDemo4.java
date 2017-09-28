package test;

/**
 * Created by Vasu Maradiya on 26-09-2017.
 */
public class ThisDemo4
{
    //this keyword can be used to return current class instance
    ThisDemo4 getThisDemo4()
    {
        return this;
    }
    void msg()
    {
        System.out.println("Hii Hello");
    }

    public static void main(String[] args) {

        ThisDemo4 this4=new ThisDemo4();
        this4.getThisDemo4().msg();

    }
}
