public abstract class Character {
    protected String name;
    protected int hitPoints;

    public Character(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void takeDamage (int points) {
        hitPoints -= points;
        //5. Make sure hitPoints never goes below 0
        if (hitPoints<0){
            hitPoints = 0;
        }
    }
//6. when hitPoints = 0, character is dead so remove "=" from >=
    public boolean isAlive () {
        return this.hitPoints > 0;
    }

    public void printDetails () {
        System.out.println(name + " (" + hitPoints + ")");
    }

    public abstract void attack (Character target);
}
