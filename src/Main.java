import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            inputs();
        }

    }

    static void inputs() {
        String codes[] = {"별1", "별2", "구구단", "맥주"};
        System.out.println("￣￣￣￣￣￣￣￣￣￣");
        System.out.println("코드 목록: ");
        for (int i = 0; i < codes.length; i++) {
            System.out.print(STR."\{codes[i]}\t\t");
            if (i % 4 == 3) {
                System.out.println();
            }
        }
        System.out.print("\n￣￣￣￣￣￣￣￣￣￣\n입력: ");
        Scanner scan = new Scanner(System.in);
        String playInput = scan.next();
        switch (playInput) {
            case "별1": ForApp.stars1(); break;
            case "별2": ForApp.stars2(); break;
            case "구구단": ForApp.gugu(); break;
            case "맥주": BottleOfBeer.beers(); break;
            default: System.out.println("입력 오류, 재입력 바람");
        }
    }
}