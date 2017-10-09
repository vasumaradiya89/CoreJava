package String;

/**
 * Created by Vasu Maradiya on 09-10-2017.
 */
public class format
{
    public static void main(String[] args) {

        String s="Vasu";
        String s1=String.format("Name is %s",s);
        String s2=String.format("Value is %f",12.36547);
        System.out.println(s1);
        System.out.println(s2);
    }
}
