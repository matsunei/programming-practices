public class Tennis extends Sports
{   
    private boolean racketIsBig;
    public Tennis(String equipment, int playersPerTeam, boolean racketIsBig)
    {
        super(equipment, playersPerTeam);
        this.racketIsBig=racketIsBig;
    }
    public boolean getRacketSize()
    {
        return racketIsBig;
    }
    public String toString()
    {
        String output="";
        output += super.toString()+"\nTennis racket big?: "+racketIsBig;
        return output;
    }
    
}
