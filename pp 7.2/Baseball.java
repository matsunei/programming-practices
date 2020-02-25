public class Baseball extends Sports
{
    private int homeRunsScored;
    public Baseball(String equipment, int playersPerTeam, int homeRunsScored)
    {
        super(equipment, playersPerTeam);
        this.homeRunsScored = homeRunsScored;
    }
    public int getScore()
    {
        return homeRunsScored;
    }
    public String toString()
    {
        String output="";
        output += super.toString()+"\nHome runs scored: "+homeRunsScored;
        return output;
    }
}
