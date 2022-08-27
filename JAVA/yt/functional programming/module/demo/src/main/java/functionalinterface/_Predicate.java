package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isPhoneValid("07000000000"));
        System.out.println(isPhoneValid("09000095030"));

        System.out.println("With predicate");
        System.out.println(isPhoneValid2.test("07000000000"));
        System.out.println(isPhoneValid2.test("09000095030"));

        System.out.println(
            "Is phone number valid and contains number 3: "+
            isPhoneValid2.or(containsNumber3).test("09000095030"));

        System.out.println(
            "Is phone number valid and contains number 3: "+
            isPhoneValid2.and(containsNumber3).test("07000000003"));
    }

    static boolean isPhoneValid(String phone) {
        return phone.startsWith("07") && phone.length() == 11;
    }

    static Predicate<String> isPhoneValid2 = phone -> phone.startsWith("07") && phone.length() == 11;
    static Predicate<String> containsNumber3 = phone -> phone.contains("03");
}
