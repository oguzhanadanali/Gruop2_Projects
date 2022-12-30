REGEX


Anchors — ^ and $

^The        matches any string that starts with The

end$        matches a string that ends with end

^The end$   exact string match (starts and ends with The end)

roar        matches any string that has the text roar in it




Quantifiers — * + ? and {}

abc*        matches a string that has ab followed by zero or more c
abc+        matches a string that has ab followed by one or more c
abc?        matches a string that has ab followed by zero or one c
abc{2}      matches a string that has ab followed by 2 c
abc{2,}     matches a string that has ab followed by 2 or more c
abc{2,5}    matches a string that has ab followed by 2 up to 5 c
a(bc)*      matches a string that has a followed by zero or more copies of the sequence bc
a(bc){2,5}  matches a string that has a followed by 2 up to 5 copies of the sequence bc



OR operator — | or []

a(b|c)     matches a string that has a followed by b or c (and captures b or c)
a[bc]      same as previous, but without capturing b or c


Character classes — \d \w \s and .

\d         matches a single character that is a digit
\w         matches a word character (alphanumeric character plus underscore)
\s         matches a whitespace character (includes tabs and line breaks)
.          matches any character

Use the . operator carefully since often class
or negated character class (which we’ll cover next) are faster and more precise.
\d, \w and \s also present their negations with \D, \W and \S respectively.
For example, \D will perform the inverse match with respect to that obtained with \d.

Uygulamalar

1. Tam Sayılar : "^(\d+)$"gm
15
12.3
56,7

2. Kesirli Sayılar: "^(\d*)[.,](\d+)$"gm
15
12.3
56,75

3. Kesir : "^(\d+)[\/](\d+)$"gm
15/12
12.3
56,75

4. Boşluksuz alfanümerik: "^(\w*)$"gm
hello
hello123
avoid this

5. Boşluklu alfanümerik: "^[a-zA-Z0-9 ]*$"gm
hello
hello123
avoid this!

6. Klasik email Kontrolü: "^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6})*$"
a.dursun@gmail.com

7. Email tokens: "^([a-z0-9_\.\+-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$"
a.dursun@gmail.com

8. Matches text avoiding additional spaces: "^[\s]*(.*?)[\s]*$"gm
test
  avoid starting spaces
avoid ending spaces
 avoid starting and ending spaces

9. Matches any valid HTML tag and the corresponding closing tag:
"<([a-z]+)([^<]+)*(?:>(.*)<\/\1>|\s+\/>)"gm

<a>match only <b>the corresponding</b> tag</a> even if there is other <b> text </b>

10. Hexadecimal value: "\B#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})\b"g
#fff
#fefefe
#242424
#24ff33
#24ff3o //o is not a valid hex value

11. Valid email (RFC5322): "\b[\w.!#$%&’*+\/=?^`{|}~\-]+@[\w-]+(?:\.[\w-]+)*\b"mg
Matches an email address like john.doe@my-domain.com inside text
valid-email@email.com
not!valid@#email.com

12. Username (simple): "^[a-z0-9_-]{3,16}$"m
Minimum length of 3, maximum length of 16, composed by letters, numbers or dashes.
not-valid user
valid-user

13. Strong password: "(?=^.{6,}$)((?=.*\w)(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[|!\"$%&\/\(\)\?\^\'\\\+\-\*]))^.*"gm
Minimum length of 6,
at least 1 uppercase letter,
at least 1 lowercase letter,
at least 1 number,
at least 1 special character

Example: my valid 2passwoRd+
         my missing number passwoRd+
         MY MISSING LOWERCASE LETTER 2PASSWORD+
         my missing uppercase letter 2passwod+
         my missing special character 2passwoRd
         not valid password
