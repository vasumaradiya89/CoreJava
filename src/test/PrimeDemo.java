package test;

/**
 * Created by Vasu Maradiya on 07-10-2017.
 */
public class PrimeDemo
    {
        public static void main(String[] args) {


           for(int i=1; i < 10; i++){

                boolean isPrime = true;
                for(int j=2; j < i ; j++){

                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime)
                    System.out.print(i + " ");
            }
        }
}
