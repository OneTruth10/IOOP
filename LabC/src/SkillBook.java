public class SkillBook extends Book{
    private String skillToLearn;
    public SkillBook(String title, String author, int numPages, String skillToLearn){
        super(title, author, numPages);
        this.skillToLearn = skillToLearn;
    }
    public String getSkillToLearn(){
        return skillToLearn;
    }
@Override
    public String toString(){
        return super.toString() + "Skill to learn: " + skillToLearn;
    }
@Override
    public void doRead(Hero hero){
        hero.setCurrentSkill(skillToLearn);
        System.out.println(hero.getName() + " has read " + title + " and now knows " + skillToLearn);
    }
}
