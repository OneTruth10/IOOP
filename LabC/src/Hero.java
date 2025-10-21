

public class Hero {
    private String name;
    private String currentSkill;
    private String facts;
    private int numFacts;

    public Hero(String name) {
        this.name = name;
        this.currentSkill = "none";
        this.facts = "";
        this.numFacts = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentSkill() {
        return currentSkill;
    }

    public void setCurrentSkill(String currentSkill) {
        this.currentSkill = currentSkill;
    }

    public int getNumFacts(){
        return numFacts;
    }

    public void readBook(Book book) {
        book.doRead(this);
    }

    public void useSkill (String skillName) {
        if (!currentSkill.equals("none") && skillName.equals(currentSkill)) {
            System.out.println(this.name + " uses " + skillName);
        } else {
            System.out.println (this.name +" does not know how to do that");
        }
    }

    public void printDetails() {
        System.out.println("Hero name: '" + name + "' \nequipped skill: " + currentSkill);
        
    }
//First method added for task 3.
    public void addJounal(String journal){
        if (numFacts<5){
            if (numFacts==0){
                facts += journal;
            }else{
                facts += ", " + journal;
            }
            numFacts+=1;
        }
    }
    //printing facts
    public void printJournal(){
        if (facts.equals("")){
            System.out.println("None");
        }else{
            System.out.println("Known facts: " + facts);
        }
    }    
}

