public abstract class Reading
{
    protected String author;
    protected String publisher;
    protected String title;
    protected int pages;

    public Reading(String author, String publisher, String title, int pages)
    {
        this.author = author;
        this.publisher = publisher;
        this.title=title;
        this.pages=pages;
    }
    public String toString()
    {
        String output = "";
        output += "\nAuthor: " + author;
        output += "\nPublisher: " + publisher;
        output += "\nTitle: " + title; 
        output += "\nNumber of pages: " + pages;
        return output;
    }
}
