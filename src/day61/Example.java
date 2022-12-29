package day61;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        final String regex = "\\b[\\w.!#$%&’*+\\/=?^`\\{|\\}~\\-]+@[\\w-]+(?:\\.[\\w-]+)*\\b";
        final String string = "Matches an email address like john.doe@my-domain.com inside text\n"
                + "valid-email@email.com\n"
                + "not!valid@#email.com";

        final Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CHARACTER_CLASS | Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}
