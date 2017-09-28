package Super;

/**
 * Created by Vasu Maradiya on 28-09-2017.
 */
public class superkey
{
    String name="Welcome";
    superkey()
    {
        System.out.println("Parent class");
    }
    void display()
    {
        System.out.println(name);
    }
}

class superkey1 extends superkey
{
    String name="Hello";
    superkey1()
    {
        System.out.println("Child class");
    }
    void display()
    {
        System.out.println(name);
        System.out.println(super.name);
       super.display();
    }
    public static void main(String[] args) {

        superkey1 superkey1=new superkey1();
        superkey1.display();

    }
}