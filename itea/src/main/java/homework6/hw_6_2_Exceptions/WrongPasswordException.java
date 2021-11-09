package homework6.hw_6_2_Exceptions;

public class WrongPasswordException extends Exception {

    public String validateRuleWrong() {
        return  "The password should contain number, latin symbols and '_' symbol or the password should be more than 20 symbol";

    }

}
