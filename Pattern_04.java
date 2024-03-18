//* * * * *
//* * * *
//* * *
//* *
//*
import java.util.Scanner;

public class Pattern_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;

        while (row <= n) {
            int star = n;

            while (star >= row) {
                System.out.print(" * ");
                star--;
            }

            System.out.println();
            row++;
        }
    }
}
