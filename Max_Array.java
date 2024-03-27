public class Max_Array {
    public static void main(String[] args) {
        int arr[]={2,3,1,51,7};
        System.out.println(max(arr));
    }
    public static int max(int arr[]){
        int maxm=Integer.MIN_VALUE;
        for (int i:arr){
            if(i>maxm){
                maxm=i;
            }
        }
        return maxm;
    }
}
