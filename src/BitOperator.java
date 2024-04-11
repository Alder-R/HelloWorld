import java.util.Objects;
import java.util.Scanner;

public class BitOperator {

    static void shift() {
        System.out.println("----Shift 연산----");
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력: ");
        int num1 = scan.nextInt();
        System.out.print("기호(<<, >>, >>>) 입력: ");
        String op = scan.next();
        System.out.print("두번째 숫자 입력: ");
        int num2 = scan.nextInt();
        System.out.printf(STR."이진수 결과: \{Integer.toBinaryString(num1)} \{op} \{num2} = ");
        switch (op) {
            case "<<": System.out.println(Integer.toBinaryString(num1 << num2)); break;
            case ">>": System.out.println(Integer.toBinaryString(num1 >> num2)); break;
            case ">>>": System.out.println(Integer.toBinaryString(num1 >>> num2)); break;
            default: System.out.println("입력 오류, 기호 재확인 바람");
        }
        System.out.printf(STR."십진수 결과: \{num1} \{op} \{num2} = ");
        switch (op) {
            case "<<": System.out.println(num1 << num2); break;
            case ">>": System.out.println(num1 >> num2); break;
            case ">>>": System.out.println(num1 >>> num2); break;
            default: System.out.println("입력 오류, 기호 재확인 바람");
        }
    }

    static void logic() {
        System.out.println("----비트 논리 연산----");
        System.out.println("&: AND(논리곱), |: OR(논리합), ^: XOR(배타적 논리합), ~: NOT(논리부정)");
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력(십진수): ");
        int num1 = scan.nextInt();
        System.out.print("기호(&, |, ^, ~) 입력: ");
        String op = scan.next();
        if (Objects.equals(op, "~")) {
            System.out.printf(STR."이진수 결과: ~\{Integer.toBinaryString(num1)} = ");
            System.out.println(Integer.toBinaryString(~num1));
            System.out.printf(STR."십진수 결과: ~\{num1} = ");
            System.out.println(~num1);
        }
        else {
            System.out.print("두번째 숫자 입력(십진수): ");
            int num2 = scan.nextInt();
            System.out.printf(STR."이진수 결과: \{Integer.toBinaryString(num1)} \{op} \{Integer.toBinaryString(num2)} = ");
            switch (op) {
                case "&": System.out.println(Integer.toBinaryString(num1 & num2)); break;
                case "|": System.out.println(Integer.toBinaryString(num1 | num2)); break;
                case "^": System.out.println(Integer.toBinaryString(num1 ^ num2)); break;
                default: System.out.println("입력 오류, 기호 재확인 바람");
            }
            System.out.printf(STR."십진수 결과: \{num1} \{op} \{num2} = ");
            switch (op) {
                case "&": System.out.println(num1 & num2); break;
                case "|": System.out.println(num1 | num2); break;
                case "^": System.out.println(num1 ^ num2); break;
                default: System.out.println("입력 오류, 기호 재확인 바람");
            }
        }
    }
}
