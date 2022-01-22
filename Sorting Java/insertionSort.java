public class insertionSort{
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[] = {8,5,12,11,9,6};

        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j;
            for(j=i-1;j>=0 && current < arr[j] ;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1] = current;
        }
         printarr(arr);

    }
}