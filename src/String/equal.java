package String;

/**
 * Created by Vasu Maradiya on 09-10-2017.
 */
public class equal
{
    public static void main(String[] args) {

        String s1="How";
        String s2="do";
        String s3="you";
        String s4="Do";

        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s4));
        System.out.println(s2.equalsIgnoreCase(s4));
    }
}
