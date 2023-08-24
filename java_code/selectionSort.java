public class selectionSort{
  public static void main(String[] args) {
    int[] arr = {2, 5, 4, 1, 3};
      sortedArray(arr);
    for (int i : arr) {
      System.out.print(i);
    }
  }

  public static void swapIndex(int[] arr, int first, int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }

  public static void sortedArray(int[] arr){
    int n = arr.length;
    
    for (int i = 0; i < n-1; i++) {
      int max = i; 
      for (int j = 0; j < n-1-i; j++) {
        if(arr[j] < arr[max]){
          max = arr[j];
        }
      }
      // swapIndex(arr, max, n-1-i);
      int temp = max;
      max = arr[i];
      arr[i] = temp;
      
    }

  }

}