package Selection_Sort;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int curr_small = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[curr_small] > arr[j]){
                    curr_small = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[curr_small];
            arr[curr_small] = temp;
        }
    }

    public static void main(String args[]){
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Unsorted array: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        selectionSort(arr);
        System.out.println("\nSorted array: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
