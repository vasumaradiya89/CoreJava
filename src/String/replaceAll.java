package String;

/**
 * Created by Vasu Maradiya on 09-10-2017.
 */
public class replaceAll
{
    public static void main(String[] args) {

        String s1="My name is Khan. My name is Bob. My name is Sonoo.";

        String s=s1.replaceAll("is","was");

        System.out.println(s);
    }
}
