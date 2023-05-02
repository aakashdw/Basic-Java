
package hellojava;
public class Combation {

public static int factorial(int n)
{
    int f=1;
    for(int i=1;i<=n;i++)
    {
        f=f*i;
    }
    return f;
}

public static int combation(int n, int r)
{
    return factorial(n)/(factorial(r)* factorial(n-r));
}

public static void main(String [] args)
{
    System.out.println(combation(5,2));
    System.out.println(combation(5,5));
}







    
}
