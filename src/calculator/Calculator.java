package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
class Calculator {

    String calculate(String[] expression) {
        System.out.println(expression[0]);
        System.out.println(expression[1]);
        System.out.println(expression[2]);


        double a = Double.parseDouble(expression[0]);
        double b = Double.parseDouble(expression[2]);


        double result1;
        switch (expression[1]) {
            case "+":
                result1 = a + b;
                break;
            case "-":
                result1 = a - b;
                break;
            case "*":
                result1 = a * b;
                break;
            case "/":
                result1 = a / b;
                break;

            default:
                return "ERROR";
        }
        if (expression.length < 4) {
            return String.valueOf(result1);
        }
        System.out.println(expression[3]);
        System.out.println(expression[4]);

        double c = Double.parseDouble(expression[4]);
        double result2;
        switch (expression[3]) {
            case "+":
                result2 = result1 + c;
                break;
            case "-":
                result2 = result1 - c;
                break;
            case "*":
                result2 = result1 * c;
                break;
            case "/":
                result2 = result1 / c;
                break;
            default:
                return "ERROR";
        }
        return String.valueOf(result2);
    }
}
