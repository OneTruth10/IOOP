public class Book {
    private String title;
    private String author;
    private Integer numPages;
    private String skill;


    public Book(String title, String author, int numPages, String skill) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.skill = skill;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public String getSkillToLearn() {
        return skill;
    }

    public void printDetails() {
        System.out.println("'"+ title + "' by " + author + " has " + numPages + " pages. You can learn " + skill+ ".");
    }
}