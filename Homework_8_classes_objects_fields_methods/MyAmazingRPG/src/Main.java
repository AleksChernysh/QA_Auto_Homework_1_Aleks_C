public class Main {
    public static void main(String[] args) {


        Character sirius = new Character();
        Character titanarm = new Character();


        sirius.name = "SIRIUS";
        sirius.health = 87;
        sirius.strength = 19;
        sirius.defense = 7;

        titanarm.name = "TITANARM";
        titanarm.health = 75;
        titanarm.strength = 11;
        titanarm.defense = 13;

        do {
            titanarm.attack(sirius);
            System.out.println("TITANARM attacks SIRIUS");
            sirius.displayStatus();
            sirius.healthUp();
            sirius.attack(titanarm);
            System.out.println("SIRIUS attacks TITANARM");
            titanarm.displayStatus();
            titanarm.useCriticalHit(sirius);
            System.out.println("TITANARM attacks SIRIUS");
            sirius.displayStatus();
            sirius.attack(titanarm);
            System.out.println("SIRIUS attacks TITANARM");
            titanarm.displayStatus();
            titanarm.healthUp();
            titanarm.useCriticalHit(sirius);
            System.out.println("TITANARM attacks SIRIUS");
            sirius.displayStatus();
        } while (sirius.isAlive() && titanarm.isAlive());
        if (sirius.health > 0) {
            System.out.println("THE WINNER IS: " + sirius.name);
        } if (titanarm.health > 0) {
            System.out.println(" THE WINNER IS: " + titanarm.name);
        }
    }
}