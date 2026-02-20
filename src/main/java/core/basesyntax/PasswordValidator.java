package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        final int MIN_PASS = 10;

        if (password != repeatPassword
                && (password.length() <= MIN_PASS || repeatPassword.length() <= MIN_PASS)) {
            throw new PasswordValidationException("Wrong passwords");
        };
    }
}
