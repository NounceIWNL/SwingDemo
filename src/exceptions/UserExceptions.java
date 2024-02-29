package exceptions;

import static java.lang.Character.isLowerCase;

public class UserExceptions {
    public static void main(String[] args) throws NotEvenException, NotCapitalLetterException {
        int a = 1;
        if (a % 2 == 1) throw new NotEvenException("not even");

        Person person = new Person("person");

    }
}

class NotEvenException extends Exception {
    public NotEvenException(String s) {
        super(s);
    }
}

class Person {
    private String name = "";

    Person(String name) throws NotCapitalLetterException {

        this.name = name;
        validateName();
    }

    private void validateName() throws NotCapitalLetterException {
        if (Character.isLowerCase(name.charAt(0))) {
            throw new NotCapitalLetterException("The first letter of name " + name + " must be capital");
        }
    }
}

class NotCapitalLetterException extends Exception {

    NotCapitalLetterException(String str) {
        super(str);
    }
}