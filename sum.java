import java.util.Scanner;

public class sum {
    public static int add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number:");
        int a = sc.nextInt();
        System.out.print("enter the second number:");
        int b = sc.nextInt();
        sc.close();

        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int result = add();
        System.out.println("the sum of both the number is :" + result);

    }
}
