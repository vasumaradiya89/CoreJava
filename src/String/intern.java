package String;

/**
 * Created by Vasu Maradiya on 09-10-2017.
 */
public class intern
{
    public static void main(String[] args) {

        String s1=new String("Java");
        String s2="Java";
        String s3=s1.intern();
        System.out.println(s1==s2);
        System.out.println(s2==s3);
    }
}
