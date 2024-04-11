public class BottleOfBeer {
    static void beers() {
        int beerNum = 99;

        while (beerNum >= 1) {
            if (beerNum == 1) {
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\n" +
                        "Take it down and pass it around, no more bottles of beer on the wall.");
            }
            else if (beerNum == 2) {
                System.out.println("2 bottles of beer on the wall, 2 bottles of beer.\n" +
                        "Take one down and pass it around, 1 bottle of beer on the wall.");
            }
            else {
                System.out.println(beerNum + " bottles of beer on the wall, " + beerNum + " bottles of beer.\n" +
                        "Take one down and pass it around, " + (beerNum - 1) + " bottles of beer on the wall.");
            }
            --beerNum;
            System.out.println();
        }
        System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
}
