package test;

/**
 * Created by Vasu Maradiya on 26-09-2017.
 */
public class Practiceconst
{
    Practiceconst() {
        System.out.println("default const");
    }
    Practiceconst(int a,int b)
    {
        int c=a*b;
        System.out.println("Ans of C is "+c);
    }
    Practiceconst(float a,float b,float c)
    {
        float d=a+b+c;
        System.out.println("Ans of D is "+d);
    }
    public static void main(String[] args) {

        Practiceconst practiceconst=new Practiceconst();
        Practiceconst practiceconst1=new Practiceconst(5,5,5);
        Practiceconst practiceconst2=new Practiceconst(10, 20);

    }
}
