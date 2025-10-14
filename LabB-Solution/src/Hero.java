public class Hero {
    private String name;
    private String currentSkill;

    public Hero(String name) {
        this.name = name;
        this.currentSkill = "none";
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

    public void readBook (Book book) {
        currentSkill = book.getSkillToLearn();
        System.out.println(this.name + " has read " + book.getTitle() + " and now knows " + currentSkill);
    }

    public void useSkill (String skillName) {
        if (!currentSkill.equals("none") && skillName.equals(currentSkill)) {
            System.out.println(this.name + " uses " + skillName);
        } else {
            System.out.println (this.name +" does not know how to do that");
        }
    }

    public void printDetails() {
        System.out.println("Hero name: '" + name + "', equipped skill: " + currentSkill);
    }
}
