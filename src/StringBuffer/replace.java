package StringBuffer;

/**
 * Created by Vasu Maradiya on 10-10-2017.
 */
public class replace
{
    public static void main(String[] args) {

        StringBuffer sb=new StringBuffer("Hello");
        sb.replace(1,4,"Java");
        System.out.println(sb);
    }
}
