package String;

/**
 * Created by Vasu Maradiya on 09-10-2017.
 */
public class Compare
{
    public static void main(String[] args) {

        String s1="Hello";
        String s2="World";
        String s3="Hello";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.compareToIgnoreCase(s3));
    }
}
