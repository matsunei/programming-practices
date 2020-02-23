public class Main
{
    public static void main(String[] args)
    {
        Sports tennis = new Tennis("Racket", 2);
        System.out.println("Tennis\n" + tennis);
        System.out.println();
        Sports baseball = new Baseball("Bat",9);
        System.out.print("Baseball\n"+baseball);
    }
}
