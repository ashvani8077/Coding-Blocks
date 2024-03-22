import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two number for finding HCF ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        if(n1>n2){
            max=n1;
            min=n2;
        }
        else {
            max=n2;
            min=n1;
        }
        while (max%min!=0){
            int rem=max%min;
            max=min;
            min=rem;
        }
        System.out.println(min);
    }
}
