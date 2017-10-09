package String;

/**
 * Created by Vasu Maradiya on 09-10-2017.
 */
public class split
{
    public static void main(String[] args) {

        String s="Java is Programming language";

        String[]w=s.split(" ");
        for(String x:w)
        {
            System.out.println(x);
        }
    }
}
