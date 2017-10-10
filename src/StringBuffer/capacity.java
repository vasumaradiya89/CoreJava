package StringBuffer;

/**
 * Created by Vasu Maradiya on 10-10-2017.
 */
public class capacity
{
    public static void main(String[] args) {

        StringBuffer s=new StringBuffer();
        System.out.println(s.capacity());
        s.append("Hello");
        System.out.println(s.capacity());
        s.append("Java is programming language and platform independant.");
        System.out.println(s.capacity());
        //ensureCapacity() method
        s.ensureCapacity(9);
        System.out.println(s.capacity());
        s.ensureCapacity(19);
        System.out.println(s.capacity());
    }
}
