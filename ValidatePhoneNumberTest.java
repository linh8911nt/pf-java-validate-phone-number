public class ValidatePhoneNumberTest {
    public static ValidatePhoneNumber phoneNumber;

    public static void main(String[] args) {
        phoneNumber = new ValidatePhoneNumber();
        String[] phoneNumberTest = {"(84)-(0939999999)", "(a8)-(22222222)"};
        for (String element: phoneNumberTest) {
            boolean isValid = phoneNumber.validatePhoneNumber(element);
            System.out.println("Phone number " + element + " is valide: " + isValid);
        }
    }
}
