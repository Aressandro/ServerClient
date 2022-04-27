public class AvvioServer 
{
    public static void main(String[] args) 
    {
        Server srv = new Server(2000); // crea istanza della classe server 
        srv.ascolto();
        srv.scrivi("Benvenuto client"); 
    }
}