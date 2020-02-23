public abstract class Sports
{
    protected String equipment;
    protected int playersPerTeam;
    public Sports(String equipment, int playersPerTeam)
    {
        this.equipment=equipment;
        this.playersPerTeam=playersPerTeam;
    }
    public String getEquipment()
    {
        return equipment;
    }
    public int playersPerTeam()
    {
        return playersPerTeam;
    }
    public String toString()
    {
        String output = "Equipment: "+equipment;
        output+="\nPlayers per team: "+playersPerTeam;
        return output;
    }
}
