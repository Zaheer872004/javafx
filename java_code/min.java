public class min{
  public static void main(String[] args) {
    int[] arr = {14,13,18,12,11,17};
    // minimum(arr);
    int ans = minimum(arr);
    System.out.println(ans);
  }
  public static int minimum(int[] arr){
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
       if(arr[i]<min){
         min = arr[i];
       }
       if(arr[i]> max){
         max = arr[i];
       }
    }
    // return max;
    return min;
    
  }



}