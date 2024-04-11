public class ForApp {       // 중첩 For 문 응용
    static void stars1() {        // 별찍기1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    static void stars2() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void gugu() {        // 구구단
        System.out.println(" [구구단]");
        for (int aNum = 1; aNum <= 9; aNum++) {
            System.out.println(STR."\{aNum}단");
            for (int bNum = 1; bNum <= 9; bNum++) {
                System.out.println(STR."\{aNum} * \{bNum} = \{aNum * bNum}");
            }
        }
    }
}
