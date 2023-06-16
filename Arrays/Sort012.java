public class Sort012 {
    public static void sort012(int[] arr)
    {
        //Write your code here
        int start = 0, mid = 0, end = arr.length - 1;
        while(mid <= end){
            if(arr[mid] == 0){
                swap(arr, start, mid);
                mid++;
                start++;
            }
            else if(arr[mid] == 2){
                swap(arr, mid, end);
                end--;
            }
            else{ 
                mid++;
            }
        }
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
