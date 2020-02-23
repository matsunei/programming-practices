import java.util.Random;

public class Coin
{
    private int face;

    public Coin()
    {
        flip();
    }
    
    public void flip()
    {
        face = (int)(Math.random() * 2);
    }
    
    public String toString()
    {
        String faceName;

        if(face==0)
        return "You got heads";
        else
        return "You got tails";
    }
}
