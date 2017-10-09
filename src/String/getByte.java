package String;

/**
 * Created by Vasu Maradiya on 09-10-2017.
 */
public class getByte
{
    public static void main(String[] args) {

        String s="Hello java";

        byte[] b=s.getBytes();

        for (int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
    }
}
