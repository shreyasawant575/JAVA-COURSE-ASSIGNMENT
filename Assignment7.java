import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // product of all elements in array
        int arr[];
    arr = new int[5];
    for(int i=0;i<5;i++){
         int element = sc.nextInt();
        arr[i] = element;
     }
         int mul = 1;
         for(int i=0;i<5;i++){
       mul *= arr[i];
   }
     System.out.println(mul);
     // smallest number in an array 
int minimum = arr[0];
     for(int i=1;i<5;i++){
         if(arr[i]<minimum){
            minimum = arr[i];
         }
     }
    
    System.out.println(minimum);
}
}
