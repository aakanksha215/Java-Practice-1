public class bubbleSort{

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        // Bubble Sort....
        int arr[] = {7,8,3,1,2};
        //int n = 5;

        for(int i=0 ; i<arr.length; i++){
            int temp;
            for(int j=0 ; j<arr.length-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
            
        }
        printarr(arr);
       
    }
}