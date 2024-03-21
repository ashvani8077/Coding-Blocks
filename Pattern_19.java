//             *
//          *  *
//       *  *  *
//    *  *  *  *
// *  *  *  *  *
// *  *  *  *  *  *
// *  *  *  *  *  *  *
// *  *  *  *  *  *  *  *
// *  *  *  *  *  *  *
// *  *  *  *  *  *
// *  *  *  *  *
//    *  *  *  *
//       *  *  *
//          *  *
//             *
import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n/2;
        int star=1;
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

            if(row<n){
                star++;
                space--;
            }
            else{
                star--;
                space++;
            }

            //row
            row++;
            System.out.println();
        }
    }
}
