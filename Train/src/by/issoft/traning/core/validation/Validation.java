package by.issoft.traning.core.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static boolean validateLetters(String txt){
        String regx = "[a-zA-Zа-яА-Я]";
        Pattern pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(txt);
        return matcher.find();
    }

    static String[] text = {"positive", "negative"};
    public static String validateNumbers(Integer number){
        return text[index(number)];
    }

    private static int index(int i) {
        return(i >> 31) & 1;
    }

}
