import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int min=sc.nextInt();
        int max=sc.nextInt();
        int step=sc.nextInt();
        for (int i=min;i<=max;i=i+step){
            int c=(int)((5.0/9)*(i-32));
            System.out.println(i+"  -  "+c);
        }
    }
}
