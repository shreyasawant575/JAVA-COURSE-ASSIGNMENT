 import java.io.*;
import java.util.Scanner;
class Helloworld {
    public static void main(String[] args) throws IOException {
    //  class- Buffereader
    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));  
        int num1= Integer.parseInt (b.readLine());
        int num2= Integer.parseInt (b.readLine());
        System.out.println(num1*num2);
    // multiplication of decimal buffer
    BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));  
        float num3= Float.parseFloat (bu.readLine());
        float num4= Float.parseFloat (bu.readLine());
        System.out.println(num3*num4); 
    // class scanner 
    Scanner sc= new Scanner(System.in);
     int num5=sc.nextInt();
      int num6=sc.nextInt();
      System.out.println(num5*num6);
      // multiplication of decimal number scanner
      Scanner sca= new Scanner(System.in);
     float num7=sca.nextFloat();
      float num8=sca.nextFloat();
      System.out.println(num7*num8);
    // if else statement
     int marks=78;
        if(marks>70){
            System.out.println("passed");
        }
        else{
            System.out.println("failed"); 
        }
    
    }
}

    
    

    
    

    
    
  