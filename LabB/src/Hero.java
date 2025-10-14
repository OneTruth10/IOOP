public class Hero {
    private String name;
    private String eqSkill;
    public Hero(String name){
        this.name = name;
        this.eqSkill = "None";
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setCurrentSkill(String eqSkill){
        this.eqSkill = eqSkill;
    }
    public void printDetails(){
        System.out.println("Name: " + name + "\nEquipped Skill: " + eqSkill);
    }
    public void useSkill(String skillName){
        if (skillName.equals(eqSkill)){
            System.out.println(name + " uses " + eqSkill);
        }else{
            System.out.println(name + " doesn't know how to use " + skillName);
        }
    }
    public void readBook(Book book){
        this.eqSkill = book.getSkillToLearn();
        System.out.println(name + " has read " + "'" + book.getTitle() + "' and now knows: " + book.getSkillToLearn());
    }
}
