import java.util.Random;

public class Die {

    static String name;
    String diceName;
    static int size;
    int currentSide;
    String creating = "Creating a dice ";
    String dots = "....";

    Random rand = new Random();

    public Die() {
        name = "d";
        size = 6;
        diceName = name + String.valueOf(size);
        currentSide = rand.nextInt(size) + 1;

        System.out.println(creating + diceName + dots);
        System.out.println("Current Side:" + currentSide);
    }

    public Die(int size) {
        name = "d";
        this.size = size;
        diceName = name + String.valueOf(size);
        currentSide = rand.nextInt(size) + 1;

        System.out.println(creating + diceName + dots);
        System.out.println("Current Side:" + currentSide);
    }

    public Die(String name, int size) {
        this.name = name;
        this.size = size;
        diceName = name + String.valueOf(size);
        currentSide = rand.nextInt(size) + 1;

        System.out.println(creating + diceName + dots);
        System.out.println("Current Side:" + currentSide);
    }

    public static String GetName() {
        return name;
    }

    public static int GetSize() {
        return size;
    }

    public void Roll() {
        name = Die.GetName();
        size = Die.GetSize();
        diceName = name + String.valueOf(size);
        currentSide = rand.nextInt(size) + 1;

        System.out.println("Rolling dice " + diceName + dots);
        System.out.println("The new value is " + currentSide);
        System.out.println();

    }

}
