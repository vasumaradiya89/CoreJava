package String;

/**
 * Created by Vasu Maradiya on 09-10-2017.
 */
public class indexOf
{
    public static void main(String[] args) {

        String s="Java is programming language.";

        //passing substring
        int i1=s.indexOf("is");
        int i2=s.indexOf("java");
        System.out.println(i1+" "+i2);

        //passing substring with from index
        int i3=s.indexOf("language",5);
        System.out.println(i3);

        //passing char value
        int i4=s.indexOf('p');
        System.out.println(i4);
    }
}
