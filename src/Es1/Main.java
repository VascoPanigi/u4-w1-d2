package Es1;

public class Main {
    public static void main(String[] args) {
        System.out.println(oddOrEvenStr("gabibbo"));
        System.out.println(oddOrEvenStr("gabobi"));
        System.out.println(leapYear(2000));
    }

    public static boolean oddOrEvenStr(String value) {
        if (value.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
        //        Best practice:
        //        return value.length() % 2 == 0;
    }

    public static boolean leapYear(int value) {

        if (value % 4 == 0) {
            if (value % 100 == 0) {
                if (value % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

