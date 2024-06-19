package lessen9.Calculator;

public class Calculator {

    protected int calculator (Numerical numerical, int a, int b) {

        switch (numerical) {

            case Multiplication -> System.out.println(a * b);

            case Addition -> System.out.println(a + b);

            case Subtraction -> System.out.println(a - b);

            case Division -> System.out.println(a / b);

            case Remainder -> System.out.println(a % b);


        }

        return a;
    }

    protected void calculator(Numerical numerical, double b, double r) {
        switch (numerical) {

            case Multiplication -> System.out.println(b * r);

            case Division -> System.out.println(b / r);

            case Addition -> System.out.println(b + r);

            case Remainder -> System.out.println(b % r);

            case Subtraction -> System.out.println(b - r);

        }

    }

}





