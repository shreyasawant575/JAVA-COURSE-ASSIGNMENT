// Pattern programs 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int rows = sc.nextInt();
          for(int i=1;i<=rows;i++){
            for(int j=0;j<i;j++){
                 System.out.print(" ");
            }
             for(int j=rows-i+1;j>0;j--){
                 System.out.print("* ");
             }
             System.out.println();
       } 
      for(int i=1;i<rows;i++){
          for(int j=1;j<=rows-i;j++){
          System.out.print(" ");
          }
          for(int j=1;j<=i+1;j++){
             System.out.print("* ");
          }
         System.out.println();
	}


// 2nd Pattern 
 int k;
        for(int i=1;i<=rows;i++){
             k=6;
             for(int j=1;j<=rows-i;j++){
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++){
                 System.out.print(k+" ");
                 k--;
             }
             System.out.println();
         }
// 3rd Pattern
          int n;
        for(int i=1;i<=rows;i++){
            n=rows-i+1;
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=rows-i+1;j>0;j--){
                System.out.print(n+" ");
                n--;
            }
            System.out.println();
        }
    }
}
