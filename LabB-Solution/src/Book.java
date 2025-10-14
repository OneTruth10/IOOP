public class Book {
    private String title;
    private String author;
    private int numPages;
    private String skillToLearn;
    
    public Book(String title, String author, int numPages, String skillToLearn) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.skillToLearn = skillToLearn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }

    public String getSkillToLearn() {
        return skillToLearn;
    }

    public void printDetails() {
        System.out.println( "'" + title + "' by " + author + " (" + numPages + "pp): " + skillToLearn);
    }

}
