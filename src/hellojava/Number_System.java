package hellojava;

public class Number_System {

    public static void main(String[] args) {
        for (int a = 0; a <= 99; a++) {
            System.out.println(a + " " + zeroToNintyNine(a));
        }

    }

    public static String zeroToNintyNine(int n) {
        if (n <= 9) {
            return oneToNine(n);
        }
        if (n % 10 == 0) {
            return tenToNintee(n);
        }
        if (n <= 19) {
            return ElevenToNinteen(n);
        }
        int tenpart = (n / 10) * 10;
        int unitpart = n % 10;
        return tenToNintee(tenpart) + " " + oneToNine(unitpart);

    }

    public static String tenToNintee(int j) {

        switch (j) {

            case 10:

                return "Ten";

            case 20:

                return "Twenty";

            case 30:

                return "Thirty";

            case 40:

                return "Forty";

            case 50:

                return "Fifty";

            case 60:

                return "Sixty";

            case 70:

                return "Seventy";

            case 80:

                return "Eighty";

            case 90:

                return "Ninty";

            default:

                return " Other then number ";

        }
    }

    public static String ElevenToNinteen(int j) {

        switch (j) {

            case 11:

                return " Eleven";

            case 12:

                return " Twolve";

            case 13:

                return " Thirteen";

            case 14:

                return " Forteen";

            case 15:

                return " Fifteen";

            case 16:

                return " Sixteen";

            case 17:

                return " Seventeen";

            case 18:

                return " Eighteen";

            case 19:

                return " Ninteen";

            case 20:

                return " Tweenteen";

            default:

                return " Other then number ";
        }
    }

    public static String oneToNine(int i) {
        switch (i) {
            case 0:

                return " Zero";

            case 1:

                return " One";

            case 2:

                return " Two ";

            case 3:

                return " Three ";

            case 4:

                return " Four ";

            case 5:

                return " Five ";

            case 6:

                return " Six ";

            case 7:

                return " Seven ";

            case 8:

                return " Eight ";

            case 9:

                return " Nine ";
            default:

                return " Other then number ";

        }
    }

}
