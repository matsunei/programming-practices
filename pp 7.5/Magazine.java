public class Magazine extends Reading
{
    private boolean trending;
    
    public Magazine(String author, String publisher, String title, int pages, boolean trending)
    {
        super(author, publisher, title, pages);
        this.trending=trending;
    }
    
    public String toString()
    {
        String output = super.toString();
        output += "\nIs this trending?: "+trending;
        return output;
    }
    
}
