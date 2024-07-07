public class Main {
    public static void main(String[] args) {


        Character sirius = new Character();
        Character titanarm = new Character();


        sirius.name = "SIRIUS";
        sirius.health = 87;
        sirius.strength = 19;
        sirius.defense = 7;
        sirius.criticalHit = sirius.strength + 20;
        sirius.strengthUp = sirius.strength + 7;

        titanarm.name = "TITANARM";
        titanarm.health = 75;
        titanarm.strength = 11;
        titanarm.defense = 13;
        titanarm.criticalHit = titanarm.strength + 15;
        titanarm.strengthUp = sirius.strength + 6;

        do {
            titanarm.attack(sirius);
            System.out.println("TITANARM attacked SIRIUS");
            sirius.displayStatus();
            sirius.healthUp();
            System.out.println("SIRIUS used health potion:  +20 health");
            sirius.attack(titanarm);
            System.out.println("SIRIUS attacked TITANARM");
            titanarm.displayStatus();
            titanarm.useCriticalHit(sirius);
            System.out.println("TITANARM has made critical attacks to SIRIUS");
            sirius.displayStatus();
            sirius.setStrengthUp();
            System.out.println("SIRIUS used strengthUp potion:  +6 strength");
            sirius.attack(titanarm);
            System.out.println("SIRIUS attacks TITANARM");
            titanarm.displayStatus();
            titanarm.healthUp();
            System.out.println("TITANARM used health potion:  +20 health");
            titanarm.useCriticalHit(sirius);
            System.out.println("TITANARM has made critical attacks to SIRIUS");
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