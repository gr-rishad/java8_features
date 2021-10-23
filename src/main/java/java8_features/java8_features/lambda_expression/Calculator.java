package java8_features.java8_features.lambda_expression;

interface CalculatorInterface {
    // void switchOn();
    // void sum(int input);
    int substract(int i1, int i2);
}


public class Calculator {

    public static void main(String[] args) {

//        CalculatorInterface calculatorInterface = () -> System.out.println("Switch On");
//        calculatorInterface.switchOn();

//        CalculatorInterface calculatorInterface = input -> System.out.println(input);
//        calculatorInterface.sum(10);

//        CalculatorInterface calculatorInterface = (a, b) -> a - b;
//        System.out.println(calculatorInterface.substract(5, 3));

        CalculatorInterface calculatorInterface = (a, b) -> {
            if (a > b) {
                return a - b;
            } else {
                throw new RuntimeException("message");
            }
        };
        System.out.println(calculatorInterface.substract(10,3));

    }

    // para     exp     body
    // ()       ->       {}
}
