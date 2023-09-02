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
        System.out.println(num3*num4);
        // greater number among 2 number
        int num5= sc.nextInt();
        int num6= sc.nextInt();
        int number5,number6;
      if(num5 >num6){
                 System.out.println("\n the largest number="+num1);
         }
        else if(num6>num5){
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
      