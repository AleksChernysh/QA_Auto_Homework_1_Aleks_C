public class Main {
    public static void main(String[] args) {


        Character sirius = new Character();
        Character titanarm = new Character();


        sirius.name = "SIRIUS";
        sirius.health = 87;
        sirius.strength = 19;
        sirius.defense = 7;
        sirius.criticalHit = sirius.strength + 20;

        titanarm.name = "TITANARM";
        titanarm.health = 75;
        titanarm.strength = 11;
        titanarm.defense = 13;
        titanarm.criticalHit = titanarm.strength + 15;

        do {
            titanarm.attack(sirius);
            sirius.displayStatus();
            sirius.healthUp();
            sirius.attack(titanarm);
            titanarm.displayStatus();
            titanarm.useCriticalHit(sirius);
            sirius.displayStatus();
            sirius.setStrengthUp();
            sirius.attack(titanarm);
            titanarm.displayStatus();
            titanarm.healthUp();
            titanarm.useCriticalHit(sirius);
            sirius.displayStatus();
        } while (sirius.isAlive() && titanarm.isAlive());
        if (sirius.health > 0) {
            System.out.println("THE WINNER IS: " + sirius.name);
        }
        if (titanarm.health > 0) {
            System.out.println(" THE WINNER IS: " + titanarm.name);
        }
        System.out.println("Total amount of Heroes: " + Character.characterCount);
    }
}