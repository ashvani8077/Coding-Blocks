import java.util.Scanner;

//*
//* *
//* * *
//* * * *
public class Pattern_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int star=1;
        while (row<=n){
            //Star
            int i=1;
            while (i<=star){
                System.out.print(" * ");
                i++;
            }
            //next row
            star++;
            row++;
            System.out.println();
        }
    }
}
