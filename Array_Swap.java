import java.util.Scanner;

public class Array_Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,5,7,8};
        System.out.println(arr[0]+ "   "+arr[1] );
        swap(arr,0,1);
        System.out.println(arr[0]+ "   "+arr[1] );
    }
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
