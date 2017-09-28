package polymor;

/**
 * Created by Vasu Maradiya on 28-09-2017.
 */
public class poly {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
class compile
    {
        public static void main(String[] args) {

            poly poly=new poly();
            System.out.println(poly.add(10,20));
            System.out.println(poly.add(10,20,30));
        }

    }

















