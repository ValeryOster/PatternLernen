package CodeWar;

import java.util.ArrayList;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class ValidBraces {
    public ValidBraces(String braces) {
        System.out.println(braces(braces));


    }

    public boolean braces(String braces) {
        char[] chars = braces.toCharArray();
        ArrayList<Character> openBr = new ArrayList<>();

        openBr.add(chars[0]);

        for (int i = 1;i< chars.length;i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                openBr.add(chars[i]);
                continue;
            }

            switch (chars[i]) {
                case '}':
                        if (openBr.get(openBr.size()-1) != '{')
                            return false;
                        else
                            openBr.remove(openBr.size() - 1);
                    break;
                case ')':
                        if (openBr.get(openBr.size()-1) != '(')
                            return false;
                        else
                            openBr.remove(openBr.size() - 1);
                    break;
                case ']':
                        if (openBr.get(openBr.size()-1) != '[')
                            return false;
                        else
                            openBr.remove(openBr.size() - 1);
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new ValidBraces("[({})][][({})][][({})][][({})][]");
    }
}
