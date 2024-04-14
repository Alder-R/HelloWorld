import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            inputs();
        }

    }

    static void inputs() {
        String codes[] = {"별1(사각형)","별2(계단)","구구단","(99병의)맥주","사칙연산","(비트)시프트","(비트)논리연산","현재시간"};
        System.out.println("￣￣￣￣￣￣￣￣￣￣");
        System.out.println("코드 목록: ");
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i]+"\t\t");
            if (i % 4 == 3) {
                System.out.println();
            }
        }
        System.out.print("\n￣￣￣￣￣￣￣￣￣￣\n * 목록의 괄호는 입력하지 말 것 * \n입력: ");
        Scanner scan = new Scanner(System.in);
        String playInput = scan.next();
        switch (playInput) {
            case "별1": ForApp.stars1(); break;
            case "별2": ForApp.stars2(); break;
            case "구구단": ForApp.gugu(); break;
            case "맥주": BottleOfBeer.beers(); break;
            case "사칙연산": SimpleCalculator.Calculator(); break;
            case "시프트": BitOperator.shift(); break;
            case "논리연산": BitOperator.logic(); break;
            case "현재시간": DateTime.currents(); break;
            default: System.out.println("입력 오류, 재입력 바람");
        }
    }
}