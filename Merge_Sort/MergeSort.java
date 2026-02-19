public class MergeSort{

    public static void mergeSort(int[] arr, int left, int right){
        if(left<right){
            int mid = left + (right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] Leftarr = new int[n1];
        int[] Rightarr = new int[n2];
        for(int i=0;i<n1;i++){
            Leftarr[i] = arr[left+i];
        }
        for(int j=0;j<n2;j++){
            Rightarr[j] = arr[mid+1+j];
        }
        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(Leftarr[i] <= Rightarr[j]){
                arr[k] = Leftarr[i];
                i++;
            }
            else{
                arr[k] = Rightarr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = Leftarr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = Rightarr[j];
            j++;
            k++;
        }
    }
    public static void main(String args[]){
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Unsorted array: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        mergeSort(arr,0,arr.length-1);
        System.out.println("\nSorted array: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}