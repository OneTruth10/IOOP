public class LoreBook extends Book{
    private String additionalPiece;
    public LoreBook(String title, String author, int numPages, String additional){
        super(title, author, numPages);
        this.additionalPiece = additional;
    }
    public String getAdditionalPiece(){
        return additionalPiece;
    }
    @Override
    public String toString(){
        return super.toString() + " Additional info: " + additionalPiece;
    }
    @Override
    public void doRead(Hero hero){
        int numFacts = hero.getNumFacts();
        if (numFacts<5){
            System.out.println(hero.getName() + " has read '" + title + "' and learned: " + additionalPiece);
            hero.addJounal(additionalPiece);
        }else{
            System.out.println(hero.getName()+ " has read '"+ title + "' but their journal is full.");
        }
    }
}
