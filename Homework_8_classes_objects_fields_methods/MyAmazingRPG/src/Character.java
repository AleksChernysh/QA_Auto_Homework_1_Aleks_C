public class Character {

    static int characterCount;

    public Character() {
        characterCount++;
    }

    String name;
    int health;
    int strength;
    int defense;


    static int potion = 20;
    static int strenthUp = 12;
    static int criticalHit = 24;

    public void healthUp() {
        this.health = this.health + potion;
    }
    public void setStrenthUp() {
        this.strength = this.strength + strenthUp;
    }
    public void useCriticalHit(Character other) {
        other.takeDamage(this.strength + criticalHit - other.defense);
    }


    public void attack(Character other) {
        other.takeDamage(this.strength - other.defense);
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (damage > 0) ;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void displayStatus() {
        System.out.println("Name of a hero :" + this.name);
        System.out.println("Health : " + this.health);
        System.out.println("Strength : " + this.strength);
        System.out.println("Defence : " + this.defense);
    }

}
//    public void attack(Character other) {
//        other.takeDamage(this.strength - other.defense);
//    }
//    public void takeDamage(int damage) {
//        this.health -= damage;
//    }

