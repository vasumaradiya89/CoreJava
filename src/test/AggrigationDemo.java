package test;

/**
 * Created by Vasu Maradiya on 27-09-2017.
 */
public class AggrigationDemo
    {
        int id;
        String name;
        AggrigationDemo(int id,String name)
        {
            this.id=id;
            this.name=name;
        }
    }
class demo1
    {
        String city;
        demo1(String city)
        {
            this.city=city;
        }
    }
class demo2
{
    String state;
    demo2(String state)
    {
        this.state=state;
    }
}
class demo4
{
    String country;
    demo4(String country)
    {
        this.country=country;
    }
}
class demo5 {
  static   int zipcode;
  static   AggrigationDemo d5;
  static   demo1 d1;
  static   demo2 d2;
  static   demo4 d4;

    demo5(int zipcode, AggrigationDemo d5, demo1 d1, demo2 d2, demo4 d4) {
        this.zipcode = zipcode;
        this.d1 = d1;
        this.d2 = d2;
        this.d4 = d4;
        this.d5 = d5;
    }

    static void display() {
        System.out.println("id :" + d5.id + "\t" + "name :" + d5.name + "\t" + "city :" + d1.city + "\t" + "state :" + d2.state + "\t"
                + "country :" + d4.country + "\t" + "zipcode :" + zipcode);
    }


    public static void main(String[] args)
    {
        AggrigationDemo aggrigationDemo=new AggrigationDemo(1,"Vasu");
        demo1 demo1=new demo1("Ahmedabad");
        demo2 demo2=new demo2("Gujarat");
        demo4 demo4=new demo4("India");
        demo5 demo5=new demo5(380015,aggrigationDemo,demo1,demo2,demo4);
        demo5.display();

    }
}