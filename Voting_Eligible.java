import java.util.Scanner;

public class Voting_Eligible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18){
            System.out.println("Not Eligible For VOTING");
        }
        else {
            System.out.println("Eligible For Voting");
        }
    }
}
