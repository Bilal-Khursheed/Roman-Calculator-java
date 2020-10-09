import java.util.Scanner;

public class RomanCalculator {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char operator = 'a';
        String stringintvalue1 = "";
        String stringintValue2 = "";
        int intvalue1 = 0;
        int intValue2 = 0;

        try {
            RomanCalculator rc = new RomanCalculator();
            System.out.println("Kindly enter Roman or integer values to calculate like(vi+i or vi + 9 or 6/3) ");
            String values = input.nextLine();

            char[] val = values.toCharArray();

            for (int i = 0; i < val.length; i++) {
                if (val[i] == ' ') {
                    continue;
                }

                if (val[i] == '+' || val[i] == '-' || val[i] == '/' || val[i] == '*') {

                    operator = val[i];
                    for (int j = i + 1; j < val.length; j++) {
                        stringintValue2 += val[j];
                        i = j;
                    }
                } else {
                    stringintvalue1 += val[i];
                }

            }

            if (!rc.isInteger(stringintvalue1.trim())) {
                intvalue1 = rc.romanToDecimal(stringintvalue1.toUpperCase());
            } else {
                intvalue1 = Integer.parseInt(stringintvalue1.trim());
            }
            if (!rc.isInteger(stringintValue2.trim())) {
                intValue2 = rc.romanToDecimal(stringintValue2.toUpperCase());
            } else {
                intValue2 = Integer.parseInt(stringintValue2.trim());
            }

            switch (operator) {
                case '+': {

                    System.out.println("Given values after Addition are::" + rc.Addition(intvalue1, intValue2));
                    break;
                }
                case '-': {
                    System.out.println(" Given values after Subtraction are::" + rc.Subtraction(intvalue1, intValue2));
                    break;
                }
                case '*': {
                    System.out.println(" Given values after Multiplication are::" + rc.Multiply(intvalue1, intValue2));
                    break;
                }
                case '/': {
                    System.out.println("Given values after Division are::" + rc.Division(intvalue1, intValue2));
                    break;
                }
                default: {
                    System.out.println("kindly enter a valid value \n OR \n \t the operator is not defined \n kindly try agian with (+ , - , * , / )");
                }
            }

        } catch (Exception err) {
            System.out.println("Found an error in input");
        }
    }

    int value(char r) {
        if (r == 'I') {
            return 1;
        }
        if (r == 'V') {
            return 5;
        }
        if (r == 'X') {
            return 10;
        }
        if (r == 'L') {
            return 50;
        }
        if (r == 'C') {
            return 100;
        }
        if (r == 'D') {
            return 500;
        }
        if (r == 'M') {
            return 1000;
        }
        return -1;
    }

    int romanToDecimal(String Roman) {
        int result = 0;

        for (int i = 0; i < Roman.length(); i++) {
            int val_1 = value(Roman.charAt(i));

            if (i + 1 < Roman.length()) {
                int val_2 = value(Roman.charAt(i + 1));

                if (val_1 >= val_2) {

                    result = result + val_1;
                } else {
                    result = result + val_2 - val_1;
                    i++;
                }
            } else {
                result = result + val_1;
                i++;
            }
        }

        return result;
    }

    public int Addition(int intvalue1, int intValue2) {
        return intvalue1 + intValue2;
    }

    public int Subtraction(int intvalue1, int intValue2) {
        return intvalue1 - intValue2;
    }

    public int Multiply(int intvalue1, int intValue2) {
        return intvalue1 * intValue2;
    }

    public int Division(int intvalue1, int intValue2) {
        return intvalue1 / intValue2;
    }

    public  boolean isInteger(String Roman) {
        if (Roman == null) {
            return false;
        }
        int length = Roman.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (Roman.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = Roman.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
