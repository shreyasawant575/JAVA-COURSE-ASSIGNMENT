 import java.io.*;
import java.util.Scanner;
class Helloworld {
    public static void main(String[] args) throws IOException {
    //  class- Buffereader
    import java.io.*;
    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));  
        int num1= Integer.parseInt (b.readLine());
        int num2= Integer.parseInt (b.readLine());
        int mul=num1*num2;
        System.out.println(num1*num2);
    // class scanner 
    Scanner sc= new Scanner(System.in);
     int num1=sc.nextInt();
      int num2=sc.nextInt();
      int mul=num1*num2;
      System.out.println(num1*num2);
     // if else statement
     int marks=70;
        if(marks>78){
            System.out.println("passed");
        }
        else{
            System.out.println("failed"); 
        }
    
    }
}

    
    

    
    

    
    
  