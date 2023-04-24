package hellojava;

public class Book1 {

String bookname,subject;
int price;
public Book1(String b, String s, int p)
{
    bookname=b;
    subject = s;
    price = p;
 }
public void display()
{
    System.out.printf("Book1name = %s, Subject = %s, Price = %s \n", bookname,subject, price);
}



public static void main(String [] args)
{
    Book1 b1 = new Book1("Basic C","C",150);
    Book1 b2 = new Book1("Adv Java", "Java", 350);
   
    
    System.out.println(b1);
    System.out.println(b2);
}
}