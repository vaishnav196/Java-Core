class Calculator{
    public int add(int a,int b){
             int addition=a+b;
             return addition;
    }
    public double add(int a ,int b,int c){
              int addition=a+b+c;
             return addition;
    }
}


class Hello {
    public static void main(String args[]){
 //arrays examples
 //int nums[]= new int[];
//   nums[0]=5;
//   nums[1]=3;
//   nums[2]=1;
//   nums[3]=8;
//  for(int i=0; i<4; i++){
    
//  System.out.println(nums[i]);
//  }


 int arrys[][]=new int[4][4];


 for (int i=0; i<4; i++){
    for(int j=0; j<4; j++){
        arrys[i][j]=(int)(Math.random()*10);
        System.out.print(arrys[i] [j]);
    }
    System.out.println();
 }

//  for loop enhanced
// int numbers=[1,2,3,4,5];
// for(int n:numbers){
//     System.out.println(n);
// }


     // System.out.println("hello world");
      // int a=12;
      // char character='a';
      // float fl=6.6;
      // double db =12.4;
      // short s=1;
      // long ln=123;
      // boolean select=true;
 

//  int x=10;
//  int y=7;
//  if(x!=y){
//   System.out.println("x is greater");
//   System.out.println("trudec");


//  }
//  else{
//   System.out.println("y is greater");

//  }

    }
}
