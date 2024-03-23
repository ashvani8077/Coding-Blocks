import java.util.Scanner;

public class Octal_To_Decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int mul=1;
        while (n>0){
            int rem=n%10;
            sum=sum+rem*mul;
            mul=mul*8;
            n=n/10;
        }
        System.out.println(sum);
    }
}
