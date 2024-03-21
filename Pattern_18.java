// *  *  *  *  *
//       *  *  *  *
//             *  *  *
//                   *  *
//                         *
//                   *  *
//             *  *  *
//       *  *  *  *
// *  *  *  *  *
import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n;
        int space=0;
        while (row<=n*2-1){



            //space
            int j=1;
            while (j<=space){
                System.out.print("   ");
                j++;
            }
            //star
            int i=1;
            while (i<=star){
                System.out.print(" * ");
                i++;
            }

            //mirror
            if(row<n){
                star--;
                space+=2;
            }
            else {
                star++;
                space-=2;
            }

            //row
            row++;
            System.out.println();
        }
    }
}
