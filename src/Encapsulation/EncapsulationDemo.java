package Encapsulation;

/**
 * Created by Vasu Maradiya on 05-10-2017.
 */
public class EncapsulationDemo

{
    int id;
    String name;
    String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
class setdemo
{
    public static void main(String[] args) {

        EncapsulationDemo encapsulationDemo=new EncapsulationDemo();
        encapsulationDemo.setId(1);
        encapsulationDemo.setName("Vasu");
        encapsulationDemo.setCity("Pune");

        System.out.println(encapsulationDemo.getId());
        System.out.println(encapsulationDemo.getName());
        System.out.println(encapsulationDemo.getCity());

    }
}