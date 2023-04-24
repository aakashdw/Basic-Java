package hellojava;

public class Book {

String bookname,subject;
int price;
public Book(String b, String s, int p)
{
    bookname=b;
    subject = s;
    price = p;
 }
public void display()
{
    System.out.printf("Bookname = %s, Subject = %s, Price = %s \n", bookname,subject, price);
}



public static void main(String [] args)
{
    Book b1 = new Book("Basic C","C",150);
    Book b2 = new Book("Adv Java", "Java", 350);
    b1.display();
    b2.display();
}
}