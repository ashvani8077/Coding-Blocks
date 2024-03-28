public class Reverse_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        for (int i=0;i<arr.length/2;i++){
            int temp1=arr[i];
            int temp2=arr[arr.length-1-i];
            arr[i]=temp2;
            arr[arr.length-1-i]=temp1;
            //System.out.println(arr[i]);
            //System.out.println(arr[arr.length-1-i]);
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
