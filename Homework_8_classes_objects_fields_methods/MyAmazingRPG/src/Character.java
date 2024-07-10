public class Character {


    public Character() {
        characterCount++;
    }

    static int characterCount;
    static final int POTION = 20;
    String name;
    int health;
    int strength;
    int defense;
    int criticalHit;

    public void attack(Character other) {
        other.takeDamage(this.strength - other.defense);
        System.out.println(this.name + " attacked " + other.name);
    }

    public void displayStatus() {
        System.out.println("Name of a hero :" + this.name);
        System.out.println("Health : " + this.health);
        System.out.println("Strength : " + this.strength);
        System.out.println("Defence : " + this.defense);
    }

    public void healthUp() {
        this.health += POTION;
        System.out.println(this.name + " used health potion:  +20 health");
    }

    public void setStrengthUp() {
        this.strength += 11;
        System.out.println(this.name + " used strengthUp potion:  +11 to strength");
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            this.health -= damage;
        }
    }

    public void useCriticalHit(Character other) {
        other.takeDamage(this.strength + this.criticalHit - other.defense);
        System.out.println(this.name + " has made critical attacks to " + other.name);
    }


    public boolean isAlive() {
        return this.health > 0;
    }


}



