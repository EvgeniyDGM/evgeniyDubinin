package homework6.hw_6_2_Exceptions;


public class LoginPassword {




    public static boolean isValidate (String logOrPass) {
        if (!(logOrPass.matches("[0-9a-zA-Z_]*"))) {
            return false;
        }
        else if (logOrPass.length() > 20 || logOrPass.length() < 1)  {
            return false;
        }
        else {
            return true;
        }

    }


    public static boolean loginForm(String login, String password, String confirmPassword) {

            try {
                if (!isValidate(login)) {
                    throw new WrongLoginException();

                }
                else if (!isValidate(password)) {
                    throw new WrongPasswordException();

                }
                else if (!password.equals(confirmPassword)){
                    System.out.println("Passwords are not the same");
                    return false;

                }
            }
            catch (WrongLoginException e) {
                System.out.println(e.validateRuleWrong());
                return false;
            }

            catch (WrongPasswordException e) {
                System.out.println(e.validateRuleWrong());
                return false;
            }

           return true;
        }


    public static void main(String[] args) {

        System.out.println(LoginPassword.loginForm("user", "pass","pass"));
    }

}



