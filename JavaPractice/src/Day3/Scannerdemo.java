package Day3;
import java.util.Scanner;
public class Scannerdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = sc.nextLine();
        System.out.println("Enter Your Age:");
        int age = sc.nextInt();
        System.out.println("Hello " + name + " You are " + age + " years old");
        sc.close();
   }
}