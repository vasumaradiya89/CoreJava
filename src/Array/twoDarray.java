package Array;

/**
 * Created by Vasu Maradiya on 03-10-2017.
 */
public class twoDarray
    {
        public static void main(String[] args)
        {
            int a[][]={{1,2,3},{4,5,6},{7,8,9}};
          /*  for(int i=0;i<2;i++)
            {
                for(int x=0;x<5;x++)
                {
                    System.out.print(" "+a[i][x]);
                }
                System.out.println();
            }*/
            int i=0;
            int j=2;
            for(int k=0;k<3;k++){
                i++;
                j++;
                System.out.println(" "+a[i][j]);
            }
        }
}
