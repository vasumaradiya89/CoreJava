package test;

/**
 * Created by Vasu Maradiya on 26-09-2017.
 */
public class ThisConst
{
    second obj;
    ThisConst(second obj)
    {
        this.obj=obj;
    }
    void show()
    {
        System.out.println(obj.a);
    }
   /* void get(ThisConst thisConst)
    {
        System.out.println("hello");
    }
    void display()
    {
        get(this);
    }*/
}

class second
{
    int a=10;

    second()
    {
        ThisConst thisConst=new ThisConst(this);
        thisConst.show();
        //thisConst.display();

    }

    public static void main(String[] args) {
        second second=new second();


    }
}
