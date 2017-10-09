package StringBuffer;

/**
 * Created by Vasu Maradiya on 09-10-2017.
 */
public class StringBufferDemo
    {
        static double t1;
        static long t2;

        static void stringdemo(){

            String s="Codekul";

            for (int i=0;i<=20000;i++){

                s.concat("institute");
            }
        }

        static void stringbufferdemo(){

            StringBuffer s=new StringBuffer("codekul");

            for(int i=0;i<=20000;i++) {

                s.append("institute");
            }
        }

        public static void main(String[] args) {

            t1=System.currentTimeMillis();
            StringBufferDemo.stringdemo();
            System.out.println("Time for string : "+(System.currentTimeMillis()-t1));

            t2=System.currentTimeMillis();
            StringBufferDemo.stringbufferdemo();
            System.out.println("Time for string : "+(System.currentTimeMillis()-t2));

        }
    }
