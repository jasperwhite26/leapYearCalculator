public class leapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }

    private static boolean isLeapYear(int year) {
        return div4Check(year);

    }

    private static boolean div4Check(int year) {
        if (year % 4 == 0) {
            return div100Check(year);

        } else {
            return false;
        }
    }

    private static boolean div100Check(int year) {
        if (year % 100 == 0){
            return div400Check(year);
        } else{
            return true;
        }
    }

    private static boolean div400Check(int year) {
        return year % 400 == 0;
    }
}
