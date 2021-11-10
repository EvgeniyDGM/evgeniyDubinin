package homework6.hw_6_2_Exceptions;

public class WrongLoginException extends Exception {

    public String validateRuleWrong()
    {
        return  "The login should contain number, latin symbols and '_' symbol or the login should be more than 20 symbol";

    }
}


