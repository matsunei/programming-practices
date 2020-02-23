public class CoinDriver
{
    public static void main(String[] args)
    {
        MonetaryCoin[] coin = new MonetaryCoin[5];
        coin[0] = new MonetaryCoin(25);
        coin[1] = new MonetaryCoin(10);
        coin[2] = new MonetaryCoin(5);
        coin[3] = new MonetaryCoin(1);
        int sum =0; 
        
        for(int i=0;i<coin.length-1;i++)
        {
            sum += coin[i].getValue();
        }
        System.out.println("Sum: " + sum+"\nChristine Vo");
        
        coin[0].flip();
        System.out.print(coin[0].toString());
    }
}
