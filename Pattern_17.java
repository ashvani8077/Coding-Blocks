//             *  *  *  *  *
//          *  *  *  *
//       *  *  *
//    *  *
// *
//    *  *
//       *  *  *
//          *  *  *  *
//             *  *  *  *  *
import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n;
        int space=n-1;
        while (row<=n*2-1){

            //space
            int i=1;
            while (i<=space){
                System.out.print("   ");
                i++;
            }

            //star
            int j=1;
            while (j<=star){
                System.out.print(" * ");
                j++;
            }

            //mirroring
            if(row<n){
                star--;
                space--;
            }
            else {
                star++;
                space++;
            }

            //row
            row++;
            System.out.println();
        }
    }
}
