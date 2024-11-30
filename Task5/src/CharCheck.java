public class CharCheck {
    public static String repCharCheck(String n) {
        char c = n.charAt(0);

        if (Character.isUpperCase(c)) {
            return "upper";
        } else if (Character.isLowerCase(c)) {
            return "lower";
        } else if (Character.isDigit(c)) {
            return "digit";
        } else {
            return "other";
        }
    }
    public static void main(String[] args) {
        System.out.println(repCharCheck("test"));
        System.out.println(repCharCheck("Task5"));
        System.out.println(repCharCheck("012345"));
        System.out.println(repCharCheck("$Dollar"));
    }
}
