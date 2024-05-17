import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Days of creation
        String dayOne = "[DAY 01] Light: God said, \"Let there be light\", and there was light. \n" +
                "He separated the light from the darkness, calling the light day \n" +
                "and the darkness night.";

        String dayTwo = "[DAY 02] Sky: God created an expanse to separate the waters above from the waters below,\n" +
                "calling the expanse \"sky\" or \"heaven\".";

        String dayThree = "[DAY 03] Land and Vegetation: God gathered the waters together so that dry ground appeared, which He \n" +
                "called \"land\" or \"earth\", and the gathered waters He called the \"seas\". He then created \n" +
                "vegetation, including seed-bearing plants and trees.";

        String dayFour = "[DAY 04] Sun, Moon, and Stars: God created the greater light (sun) to govern the day, \n" +
                "lesser light (moon) to govern the night, and also the stars.";

        String dayFive = "[DAY 05] Sea Creatures and Birds: God created the creatures of the sea and every \n" +
                "living thing that moves in the water, as well as the birds to fly above the earth.";

        String daySix = """
                [DAY 06] Land Animals and Humans: God created the land animals, including\s
                livestock, creatures that move along the ground, and wild animals. He also created Humans\s
                in His own image, male and female, and gave them dominion over the earth and its creatures.""";

        String daySeven = "[DAY 07] Rest: God finished His work of creation and rested on the seventh day, \n" +
                "blessing it and making it holy.";


//        Main
        System.out.println("Hi there, this is a quick reference to the story of creation as written in the book of Genesis.\n");

        Scanner in = new Scanner(System.in);

            System.out.println("""
                    Which day do you want to know what was being created?
                    (1) Day One - (7) Day Seven \n""");

            System.out.println("Reply: ");
            int num = in.nextInt();

            switch (num) {
                case 1:
                    System.out.print(dayOne);
                    break;
                case 2:
                    System.out.print(dayTwo);
                    break;
                case 3:
                    System.out.print(dayThree);
                    break;
                case 4:
                    System.out.print(dayFour);
                    break;
                case 5:
                    System.out.print(dayFive);
                    break;
                case 6:
                    System.out.print(daySix);
                    break;
                case 7:
                    System.out.print(daySeven);
                    break;
                default:
                    System.out.println("Unknown reply.");
            }
    }
}
