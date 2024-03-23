import java.util.Scanner;

public class Float_Double {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d=13.6;
        float f=2.323f;
        d=f;
         boolean b=true;
         boolean f1=false;
         char ch='z';
         char ch1='a';
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println((int)ch);
        System.out.println((int)ch1);
        System.out.println(ch+ch1);
        System.out.println();
        ch1++;
        System.out.println(ch1);
        System.out.println();
        ch=(char)(ch+1);
        System.out.println(ch);
        System.out.println("INput in character");   //input in character
        char ct=sc.next().charAt(0);
        System.out.println(ct);

    }
}
