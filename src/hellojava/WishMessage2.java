package hellojava;
public class WishMessage2 {
    
    
    public static void printHello(int n, String message)
    {
        for(int i=1;i<=n;i++)
            System.out.println(message);
    }
    public static void main(String [] args)
    {
        printHello(5,"Hello");
        
        printHello(10,"Hi");
        
        printHello(7,"Bye");
    }
}
