import java.util.*;

public class bubbleSort{
  public static void main(String[] args) {
    // int[] arr = {51, 13, 11, 41, 21, 19};
    int[] arr = {1,2,3,4,5,6,7,9};
    bubbleIsSort(arr);
    for (int i : arr) {
      System.out.print(i+" ");
    }
  }

  /* This is brute force method which I'm thinked according to me */
  // public static void sort(int[] arr){
  //   // boolean isSort = true;
  //   for (int i = 0; i < arr.length-1; i++) {
  //     for (int j =i+1; j < arr.length; j++) {
  //        if(arr[i]>arr[j]){
  //         // Collections.swap(arr[i],arr[j]);
  //         int temp = arr[i];
  //         arr[i] = arr[j];
  //         arr[j] = temp;
  //        }
  //        else{
          
  //        }
  //     }
  //   }

  // }
  public static void bubbleIsSort(int [] arr){
    int n = arr.length;
    // boolean isSortedInArray = false;
    for (int i = 0; i < n-1; i++) {
          boolean isSortedInArray = false;

      for (int j = 0; j < n-1-i; j++) {
        // System.out.println("I'm in");
        if(arr[j] > arr[j+1]){
          //swap
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          System.out.println("I'm in");
          isSortedInArray = true;
        }
        
      }
      if(isSortedInArray == false)
        break;
      
    }
  }

}