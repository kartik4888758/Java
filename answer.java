// ---
// public class answer {
//     public static void main(String[] args) {
//         System.out.println("hello world");
//     }

// }

//2.
// public class answer {
//     public static int add() {
//         int a = 10;
//         int b = 20;
//         int c = a + b;
//         return c;
//     }

//     public static void main(String[] args) {

//         int result = add();
//         System.out.println("the sum is:" + result);
//     }
// }

//3.
// import java.util.Scanner;

// public class answer {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number:");
//         int a = sc.nextInt();
//         if (a % 2 == 0) {
//             System.out.println("the number is even.");
//         } else {
//             System.out.println("the number is odd.");
//         }

//         sc.close();

//     }

// }

//4.
// import java.util.Scanner;

// public class answer {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number:");
//         int a = sc.nextInt();
//         System.out.print("enter second number:");
//         int b = sc.nextInt();
//         System.out.print("enter third number:");
//         int c = sc.nextInt();
//         if (a > b && a > c) {
//             System.out.println("a is the largest among three numbers.");
//         } else if (b > a && b > c) {
//             System.out.println("b is the largest among three numbers.");
//         } else {
//             System.out.println("c is the largets among three numbers.");
//         }

//         sc.close();

//     }
// }

//5.
import java.util.Scanner;

public class answer {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int a = sc.nextInt();
    sc.close();

    long factorial = calculateFactorial(a);
    System.out.println(a + "! is: " + factorial);
  }

  public static long calculateFactorial(int a) {
    if (a < 0) {
      System.out.println("invalid argument!!!");
    }

    long factorial = 1;
    for (int i = 1; i <= a; i++) {
      factorial *= i;
    }
    return factorial;
  }
}
