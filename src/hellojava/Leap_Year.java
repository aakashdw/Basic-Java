package hellojava;
public class Leap_Year {
    public static boolean isLeapYear(int year)
    {
        if(year % 400 == 0)
            return true;
        if(year % 4  == 0  && year %100 !=0 )
            return true;
            return false;
    }
    
    public static int getDaysinMonths(int month,int year)
    {
        switch(month)
        {
            case 4:
               
            case 6:
            
            case 9:
                
            case 11 :
                return 30;
                
            case 2:
                if(isLeapYear(year))
                    return 29;
                else
                    return 28;
            default : return 31;
                          
        }
      
    }
    
    
    
    public static int getDifference(int d1, int m1, int y1, int d2, int m2,int y2)
    {
        int diff1=d1-1;
        int diff2=d2-1;
        int diff3 = 0;
        for(int month=1; month<=m1-1;month++)
        {
            diff3=diff3 + getDaysinMonths(month,y1);
        }
                   
                    int diff4=0;
                    for(int month =1;month <=m2-1;month++)
                    {
                        diff4=diff4 + getDaysinMonths(month,y2);
                    }
                    int diff5=0;
                            for(int year =y2;year <=y1-1;year++)
                            {
                                if(isLeapYear(year))
                                    diff5 = diff5 + 366;
                                else
                                    diff5= diff5 +365;
                            }
                            return diff1 + diff3 + diff5 -diff2 - diff4;
        }
    
    
    public static void main(String [] args)
    {
        System.out.println(getDifference(1,1,2019,1,1,2018));
        System.out.println(getDifference(1,1,2017,1,1,2016));
        System.out.println(getDifference(16,2,2019,15,8,1947));
        System.out.println(getDifference(16,1,2019,16,1,1970));
    }
}
