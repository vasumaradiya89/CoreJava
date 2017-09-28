package test;

/**
 * Created by Vasu Maradiya on 26-09-2017.
 */
public class ThisDemo {
    //this: to refer current class instance variable
   int id;
   String name;

    ThisDemo(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }

    public static void main(String[] args)
    {
       ThisDemo thisDemo=new ThisDemo(1,"Vasu");
       thisDemo.display();
    }
}
