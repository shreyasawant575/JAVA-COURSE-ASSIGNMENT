// Pattern programs
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    int rows = sc.nextInt();
	    int m = 5;
	    for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } 
        // pattern 2
        int n=10;
	    for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
         // pattern 3
        int a = 4;
        int count = 1;
        for (int i = 1; i <= a; i++) {
            for (int j = a - i; j > 0; j--) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
                System.out.println();
        }
            //pattern 4
           int b = 5;
            for (int i = 1; i <= b; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	 
	}
}