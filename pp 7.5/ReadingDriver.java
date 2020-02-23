public class ReadingDriver
{
    public static void main(String[] args)
    {
        Reading[] library = new Reading[2];
        Novel aliceInWonderland = new Novel("Charles Lutwidge", "Lewis Carroll", "Alice in Wonderland", 200, 12, true);
        Magazine cosmopolitan = new Magazine("Helen Gurley Brown", "William Randolph Hearst", "Cosmopolitan", 75, true);

        library[0] = aliceInWonderland;
        library[1] = cosmopolitan;

        for (int i = 0; i < library.length;i++)
        {
            System.out.println(library[i]);
        }
    }
}
