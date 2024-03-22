import java.util.Scanner;

public class nCr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Value of n: ");
        int n=sc.nextInt();
        System.out.println("Value of r: ");
        int r=sc.nextInt();
        int nr=n-r;
        int factn=1;
        int factr=1;
        int factnr=1;
        for (int i=n;i>0;i--){
            factn=factn*i;
        }
        for (int i=r;i>0;i--){
            factr=factr*i;
        }
        for (int i=nr;i>0;i--){
            factnr=factnr*i;
        }
        double denominator=(double)factnr*factr;
        double result=factn/denominator;
        System.out.println(result);
    }
}
