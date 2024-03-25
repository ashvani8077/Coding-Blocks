import java.util.Scanner;

public class Fun_Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        add();
        sub();
    }

    public static void add(){
        int a=11;
        int b=17;
        int c=a+b;
        System.out.println(c);
    }

    public static void sub(){
        int a=14;
        int b=3;
        int c=a-b;
        System.out.println(c);
    }
}
