import java.util.Scanner;

public class HelloWorld {
    static void hello() {
        System.out.println("Hello, World!");
    }

    static void upper() {
        System.out.print("입력: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.next().toUpperCase();
        System.out.print("출력: ");
        System.out.println(input);
    }

    static void lower() {
        System.out.print("입력: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.next().toLowerCase();
        System.out.print("출력: ");
        System.out.println(input);
    }
}
