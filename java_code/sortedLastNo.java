public class sortedLastNo{
  public static void main(String[] args) {
    int[] arr ={2, 5, 6, 8, 9, 1};
    sortLastElement(arr);
    for (int i : arr) {
      System.out.print(i+" ");
    }
  }


  public static void sortLastElement(int[] arr){
    int len = arr.length;    // array size
    int last = arr[len-1];    // last element stored in last variable
    int swapIndex = len-2;    // last element is checked from last to last position
    // int swapIndex = arr[len-2];

    while(swapIndex >= 0 && arr[swapIndex] > last){
        swapIndex--;    // in above loop will go until swapIndex >= zero
    }                   // and swapIndex position element is greater then last element if yes then swapIndex is decrement

    for (int i = len-1; i >= swapIndex+2; i--) {
      arr[i] = arr[i-1];    // arr[5] = arr[4] put element of 4 index into 5 index
    }
    arr[swapIndex+1] = last; // at the end last is put is free space

  }
}