package hellojava;
public class Rectangle_2 {
    
        int length, width;
        Rectangle_2 (int x, int y)
        {
            length =x;
            width =y;
        }
        int rectArea()
        {
            return (length * width);
        }
    }

class RectangleArea
{
    public static void main(String [] args)
    {
        Rectangle_2 rect1= new Rectangle_2(15,10);
        int area1 = rect1.rectArea();
        System.out.println(" Area1 = " + area1);
    }
}
