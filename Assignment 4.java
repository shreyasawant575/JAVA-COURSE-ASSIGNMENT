import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        // difference of 2 numbers
         Scanner sc= new Scanner(System.in);
         int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int diff = num1-num2;
        System.out.println(num1-num2);
        //multiplication of 2 numbers
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int mul = num3*num4;
        System.out.println(num3*num4);
        // greater number among 2 number
          int num1= sc.nextInt();
          int num2= sc.nextInt();
          int number1,number2;
      if(num1 >num2){
                 System.out.println("\n the largest number="+num1);
         }
        else if(num2>num1)
        {
               System.out.println("\n the smallest number="+num2);
        }
        else {
            System.out.println("\n both are equal");
        }
        //Table of 8 till 20
         for(int i=1;i<=20;i++){
        int mul= 8*i;
            System.out.println("8 x "+i+" = "+mul);
         }
    }
}
      