package String;

/**
 * Created by Vasu Maradiya on 09-10-2017.
 */
public class charArray
{
    public static void main(String[] args) {

        String s="Java";

        char[] c=s.toCharArray();

        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
    }
}
