import java.util.Scanner;

public class Inverse_Of_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int re=0;
        while (n!=0){
            int rem=n%10;
            re=re+i*(int)(Math.pow(10,rem-1));
            n=n/10;
            i++;
        }
        System.out.println(re);
    }
}
