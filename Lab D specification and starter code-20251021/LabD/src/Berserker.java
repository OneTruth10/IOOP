
import java.util.Random;

public class Berserker extends Character {
    
    public Berserker(String name){
        super(name, 15);
    }

    @Override
    public void printDetails() {
        System.out.println("A berserker called " + this.name + " with HP " + hitPoints);
    }

    @Override
    public void attack(Character target) {
        Random rn = new Random();
        int max = 10;
        int min = 1;
        int damage = 3;
        int randomInt = rn.nextInt((max - min) + 1) + 1;
        if (hitPoints<=7){
            damage = 5;
            System.out.println(name + " is on low hitpoint. He swings a sword with more power and deals " + damage + " damage.");
        }else if (randomInt<=3){
            damage = 5;
            System.out.println("Critical hit by " + name + ". " + target.getName() + " takes " + damage + "damage.");
        }else if (randomInt<=5){
            damage = 0;
            System.out.println(name + " misses his attack. 0 damage to " + target.getName() + ".");
        }else{
            System.out.println(name + " slices " + target.getName() + "by his sword. " + damage + "damage on " + target.getName() + ".");
        }
        target.takeDamage(damage);
    }

}