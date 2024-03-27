public class Linear_Search {
    public static void main(String[] args) {
         int arr[]={2,3,4,5,-4,7,11};
         int item=4;
        System.out.println(ind(arr,item));

    }
    public static int ind(int arr[],int item){
        int inde=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==item) {
                inde = i;
                break;
            }
        }
        return inde;
    }
}
