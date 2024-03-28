public class Reverse_Array_In_Range {
    public static void main(String[] args) {
        int arr[]={32,2,4,21,53,65,34,65,31,87,43};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        reverse(arr,2,6);
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void reverse(int arr[],int i,int j){
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
