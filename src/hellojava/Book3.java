package hellojava;

public class Book3 {

String bookname,subject;
int price;
public Book3(String b, String s, int p)
{
    bookname=b;
    subject = s;
    price = p;
 }
public void display()
{
    System.out.printf("Book3name = %s, Subject = %s, Price = %s \n", bookname,subject, price);
}



public static void main(String [] args)
{
    Book3 b1 = new Book3("Basic C","C",150);
    Book3 b2 = new Book3("Adv Java", "Java", 350);
   
    
    System.out.println(b1);
    System.out.println(b2);
}


public String toString()
{
    return String.format("Book Name= %s, Subject=%s,Price = %s",bookname,subject,price);
}
}