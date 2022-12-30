package day61;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        final String regex = "\\b[\\w.!#$%&’*+\\/=?^`\\{|\\}~\\-]+@[\\w-]+(?:\\.[\\w-]+)*\\b";
        final String string = "Matches an email address like john.doe@my-domain.com inside text\n"
                + "valid-email@email.com\n"
                + "not!valid@#email.com";
        final String subst = "xxxxxxxxxxxxxxxx";

        final Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CHARACTER_CLASS | Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        // The substituted value will be contained in the result variable
        final String result = matcher.replaceAll(subst);

        System.out.println("Substitution result: " + result);
    }
}

