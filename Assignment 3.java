// covert into logic
//45 to 60 - 45>= and 60<=
//78 to 99- 78>= and 99<=
//10 to 90- 10>= and 90<=
//11 to 55- 11>= and 55<=
// else if statement range
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
    int marks=88;
    if(marks >= 81 && marks <=90){
    System.out.println("Distinction");
    }
    else if(marks >=71 && marks <= 80 ){
    System.out.println("avg");
    }
    else if(marks >=61 && marks <= 70){
    System.out.println("just passed");
    }
    else if(marks >=41 && marks <= 50){
    System.out.println("need to improve");
    }
    else{
    System.out.println("failed");
    }
  
// unarary operater
int num = 7;
System.out.println(num++);
System.out.println(++num);
// Operators 
// Arithmetic operator
int num1=15;
    num1 += 10;
    System.out.println(num1);
// Assignment operator 
int a=5;
int b=6;
int c=a+b;
System.out.println(c);
// Relational operator
int marks1=70;
    if (marks1>60){
System.out.println("passed");
    }
// Logical operator
int percentage=88;
if(percentage >= 81 && percentage <=90){
System.out.println("Distinction");  
}
// Bitwise operator 
 int d=2;
int e=6;
System.out.println("d&e="+ (d&e));
// Shift operator 
int x=14;
int y=6;
System.out.println("right shift x >> 2 is:" + (x>>2));
System.out.println("left shift y << 3 is:" +(y<<3));
//Ternary operator
int ans = (num >=5)? 5 : 1;
System.out.println(ans);
// switch case statement 
Scanner sc= new Scanner(System.in);
        int num5 = sc.nextInt();
         switch(num5){
        case 1:
               System.out.println("one");
               break;
        case 2:
                 System.out.println("two");
                 break;
        case 3:
               System.out.println("three");
               break;
        case 4:
               System.out.println("four");
               break; 
        case 5:
               System.out.println("five");
               break;
        case 6:
               System.out.println("six");
               break;
        case 7:
               System.out.println("seven");
               break;
        case 8:
               System.out.println("eight");
               break;
        case 9:
               System.out.println("nine");
               break;
         }
    }
}



