public class DiceGame {
    public static void main(String[] args) {

        Die dice = new Die();
        dice.Roll();
        System.out.println();

        Die dice1 = new Die(20);
        dice1.Roll();
        System.out.println();

        Die dice2 = new Die("crazy", 50);
        dice2.Roll();
        System.out.println();

    }
}