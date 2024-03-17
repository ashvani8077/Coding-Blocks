import java.util.Scanner;

public class Grade_Card {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        if(num>90){
            System.out.println("O");
        }
        if(num<91&&num>80){
            System.out.println("A");
        }
        if(num<81&&num>70){
            System.out.println("B");
        }
        if(num<71&&num>60){
            System.out.println("C");
        }
        else {
            System.out.println("Fail");
        }
    }
}
