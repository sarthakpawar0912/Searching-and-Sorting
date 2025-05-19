package SORTING.BUBLE;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        int [] arr={12,34,56,76,89,02,34};
        System.out.println("Bubble Sort");
        System.out.println("Before:"+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After:"+Arrays.toString(arr));
    }
}
