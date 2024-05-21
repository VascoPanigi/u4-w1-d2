package Es2;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(convertToLettersSmallNumbers(10));
    }

    public static String convertToLettersSmallNumbers(int value) {
        switch (value) {
            case (0):
                return "zero";
            case (1):
                return "uno";
            case (2):
                return "due";
            case (3):
                return "tre";
            default:
                return "The number you inserted is too big and my pc too weak to stamp it";


//            return switch (value) {
//                case (0) -> "zero";
//                case (1) -> "uno";
//                case (2) -> "due";
//                case (3) -> "tre";
//                default -> "The number you inserted is too big and my pc too weak to stamp it";
        }
    }
}
