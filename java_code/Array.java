public class Array{
  // how array work?
  // creating and declartion of array


  // Arrays contain similar data type in contigious memory location
  public static void main(String[] args) {
    // System.out.println("Hello world !");
    // declaration int age;
    // initialistion-- age = 19;
     
    // In array declaration
    // int[] nums; or int nums[];

    // int age[];  //declaration
    // age = new int[5];  //allocation

    // int[] age = new int[5];            --> new keyword make heap memory of an object
    // int [] nums = {1,2,3,4};
    
    
    int[] age = new int[20];            //--> new keyword make heap memory of an object
    
    age[0] = 5;
    age[1] = 2;
    // age[2] = 3;
    // age[3] = 4;
    // age[4] = 8;
    
    // System.out.println(age[0]);
    // System.out.println(age[1]);
    // System.out.println(age[2]);
    // System.out.println(age[3]);
    // System.out.println(age[4]);

    // int len = age.length;
    // System.out.println(len);
    

    // int[] nums = {98,95,93,92};
    // System.out.println(nums[0]);
    // System.out.println(nums[1]);
    // System.out.println(nums[2]);
    // System.out.println(nums[3]);



    //  loop 
    //   String[] nums = {"Zaheer" ,"Habib" ,"Khan"};
    // for (int i = 0; i < nums.length; i++) {
        // System.out.println("Names is : "+ (i+1) +" "+nums[i]);
    // }
    // output is 
    //Names is : 1 Zaheer
    //Names is : 2 Habib
    //Names is : 3 Khan


    // for-each loop
    // for (String name: names){
      //System.out.println(names);
    //}

      String[] names = {"Zaheerkhan" ,"Habib" ,"Khan"};
    for(String name : names){           // iterate each element in an array
      System.out.println(name);


    }




    





























   
  }

}