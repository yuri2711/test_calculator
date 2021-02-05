package lib;

public class Calculation {
    private int _1;
    private int _2;

    public int getResult(String a, String b, String c) {
        if (get(a) == 0) {
            try {
                _1 = Integer.parseInt(a);
                _2 = Integer.parseInt(c);
            } catch (Exception e) {
                System.out.println("Не правильные входные данные. Программа завершает свою работу...");
                System.exit(1);
            }
            if (_1 > 10 && _2 > 10) {
                System.out.println("Вы вышли за пределы от 1 до 10. Попробуйте еще раз... ");
                return 1000;
            }
            return arithmetic(b);
        } else {
            _1 = get(a);
            _2 = get(c);
            int w = arithmetic(b);
            if (w > 0 && w < 4000) {
                convert(w);
            }

            return 1000;
        }
    }

    private int arithmetic(String symbol) {
        switch (symbol) {
            case "+":
                return _1 + _2;
            case "-":
                return _1 - _2;
            case "*":
                return _1 * _2;
            case "/":
                if (_2 == 0) {
                    System.out.println("На нуль делить нельзя. Программа завершает свою работу");
                    System.exit(2);
                } else return _1 / _2;
            default: {
                System.out.println("Не правильное арифметическое действие");
                System.exit(3);
            }
        }
        return 0;
    }

    private String roman(int num, String one, String five, String teen) {
        if (num >= 1) {
            switch (num) {
                case 1:
                    return one;
                case 2:
                    return one + one;
                case 3:
                    return one + one + one;
                case 4:
                    return one + five;
                case 5:
                    return five;
                case 6:
                    return five + one;
                case 7:
                    return five + one + one;
                case 8:
                    return five + one + one + one;
                case 9:
                    return one + teen;
            }
        }
        return "";
    }

    private String convert(int n) {
        String romanOnes = roman(n % 10, "I", "V", "X");
        n /= 10;
        String romanTens = roman(n % 10, "X", "L", "C");
        n /= 10;
        String romanHundreds = roman(n % 10, "C", "D", "M");
        System.out.println(romanHundreds + romanTens + romanOnes);
        return romanHundreds + romanTens + romanOnes;
    }

    private int get(String in) {
        switch (in.toUpperCase()) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                return 0;
        }
    }
}
