public class Novel extends Reading
{
    private int chaptersCount;
    private boolean hasMovie;
    
    public Novel(String author, String publisher, String title, int pages, int chaptersCount, boolean hasMovie)
    {
        super(author, publisher, title, pages);
        this.chaptersCount=chaptersCount;
        this.hasMovie=hasMovie;
    }
    
    public String toString()
    {
        String output = super.toString();
        output += "\nAmounts of chapters: "+chaptersCount;
        output += "\nHas a movie?: "+hasMovie;
        return output;
    }
}
