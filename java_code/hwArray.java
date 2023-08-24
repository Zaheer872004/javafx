public class hwArray {
  public static void main(String[] args) {






    int[] nums = {23,12,6,7,15,33,22,56};
      int sum = 0;
      // for (int i = 0; i < nums.length; i++) {   // or also wittten as--> for(int num : nums){ sum+=nums[i];} sout(sum)
      //     sum += nums[i];
      // }

      // System.out.println("Sums of above nums is :"+sum);





    int min =Integer.MAX_VALUE;
    // for(int num : nums){
    //     if(num<min){
    //       min=num;
    //     }
    // }
    //   System.out.println(min);






    int max = Integer.MIN_VALUE;
    for (int num : nums) {
      if( num > max)
        max = num; 
    }

      System.out.println(max);



      // 2D array
      // int[][] marks = new int[4][3];
  
      int[][] marks = {
        {12,13,14,15},
        {16,17,18,19},
        {20,21,22,23},
        {24,25,26,27}
      };
      System.out.println(marks[2][1]);
      System.out.println(marks[2][2]);
      System.out.println(marks[1 ][3]);
      




  }
}
