package test;

/**
 * Created by Vasu Maradiya on 26-09-2017.
 */
public class practice_const
{
    int x,y,z;

    public practice_const(int x, int y) {

        this.x=x;
        this.y=y;

    }
    void add()
    {
        z=x+y;
        System.out.println(z);
    }

    public static void main(String[] args) {

        practice_const practice_const=new practice_const(10, 10);
        practice_const.add();

    }
}
