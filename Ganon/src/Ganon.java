import java.io.*;
public class Ganon {
    public static void main(String arr[]) throws FileNotFoundException {


        double KB1 = 0;
        double KB2 = 0;
        double percent = 0;
        double staleness = 1.05;
        int weight = 0;
        double kbg1 = 93;
        double bkb1 = 20;
        double kbg2 = 86;
        double bkb2 = 40;
        double damage1 = 18;
        double damage2 = 17;
        PrintStream o = new PrintStream(new File("A.txt"));
        System.setOut(o);
        while (weight < 135)

        {
            while (KB1 < KB2) {
                percent = percent + 1;
                KB1 = (((((((percent + damage1 * staleness) / 10 + (((percent + damage1 * staleness) * damage1 * (1 - (1 - staleness) * 0.3)) / 20)) * 1.4 * (200 / (weight + 100))) + 18) * (kbg1 / 100)) + bkb1));
                KB2 = (((((((percent + damage2 * staleness) / 10 + (((percent + damage2 * staleness) * damage2 * (1 - (1 - staleness) * 0.3)) / 20)) * 1.4 * (200 / (weight + 100))) + 18) * (kbg2 / 100)) + bkb2));
            }

            System.out.println("Weight          Percent\n");
            System.out.println(weight + "            " + percent + "\n");
            weight++;
            percent = 0;
        }
    }
}

