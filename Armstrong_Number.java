import java.sql.SQLType;
import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Armstrong(n);
    }

    //Function to check number is armstrong or not
    public static void Armstrong(int n){
        int count=0;
        int temp=n;
        int check=n;
        int sum=0;
        while (temp!=0){
            temp=temp/10;
            count++;
        }
        //System.out.println(count);
        while (n!=0){
            int rem=n%10;
            sum=sum+(int)Math.pow(rem,count);
            n=n/10;
        }
        if(sum==check){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}
