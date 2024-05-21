package Es4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        countdown();
    }

    public static int countdown() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number");
        int value = Integer.parseInt(sc.nextLine());
        for (int i = value; i >= 0; i--) {
            System.out.println(i);
            
        }
        return value;
    }
}
