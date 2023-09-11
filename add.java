// import java.util.Scanner;
// public class add{
//     public static void main(String[] args) {
//         Scanner apple=new Scanner(System.in);

//         System.out.print("enter a number:");
//         int a=apple.nextInt();
//         System.out.print("enter another number:");
//         int b=apple.nextInt();
//         System.out.print("enter third number:");
//         int c=apple.nextInt();

//         int d=a+b+c;
//         System.out.println("value of addition is :"+d);
//         apple.close();

//     }

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner ion = new Scanner(System.in);
        System.out.println("enter the language you want to select: 1 for english 2 for hindi 3 for exit");
        int a = ion.nextInt();

        switch (a) {
            case 1:
                System.out.println("thank you for choosing english.");
                break;
            case 2:
                System.out.println("hindi chuun ne k liye dhanyawaad.");

            default:
                break;
        }
        ion.close();

    }
}
