import java.util.Scanner;

public class SimpleCalculator {
    static void Calculator() {
        System.out.println("----사칙연산----");
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력: ");
        double num1 = scan.nextDouble();
        System.out.println();
        System.out.print("기호(+, -, *, /) 입력: ");
        String op = scan.next();
        System.out.print("두번째 숫자 입력: ");
        double num2 = scan.nextDouble();
        System.out.printf(STR."\{num1} \{op} \{num2} = ");
        switch (op) {
            case "+": System.out.println(num1 + num2); break;
            case "-": System.out.println(num1 - num2); break;
            case "*": System.out.println(num1 * num2); break;
            case "/": System.out.println(num1 / num2); break;
            default: System.out.println("입력 오류, 기호 재확인 바람");
        }
    }
}
