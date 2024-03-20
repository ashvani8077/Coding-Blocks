//*               *
//* *           * *
//* * *       * * *
//* * * *   * * * *
//* * * * * * * * *
import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=(n*2)-3;
        while (row<=n){

            //star
            int i=1;
            while (i<=star){
                System.out.print(" * ");
                i++;
            }

            //space
            int j=1;
            while (j<=space){
                System.out.print("   ");
                j++;
            }


            //star
            int k=1;
            if(row==n){
                k=2;
            }
            while (k<=star){
                System.out.print(" * ");
                k++;
            }

            //row
            row++;
            star++;
            space-=2;
            System.out.println();
        }
    }
}
