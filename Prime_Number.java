//check number is prime or not
import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number: ");
        int count=0;
        int n=sc.nextInt();     //if there is any i between 2 to n-1 which completely divide number then number is not a prime number.
        for (int i=2;i<n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println("Not a Prime Number");
        }
        else {
            System.out.println("Prime Number");
        }
    }
}
