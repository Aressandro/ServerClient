public class CountDown extends Thread 
{
    private int time; 
    
    public CountDown(int time)
    {
        this.time=time;
    }
    
    public void run()
    {
        for(int i = time; i >= 0; i--)
        {
            System.out.println(i);
            try 
            {
                sleep(1000);
            } 
            catch (InterruptedException ex) 
            {
                
            }
        }
    }   
}