package Es3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
//        System.out.println(stringSpacer(value));
        stringSpacer();
    }

    public static String stringSpacer() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Insert a string");
            String value = sc.nextLine();

            if (value.equals(":q")) {
                return "See you space cowboy!";
            } else {
                String[] subdividedValue = value.split("");
                String finalValue = String.join(", ", subdividedValue);
                System.out.println(finalValue);
            }
        }
    }
}
