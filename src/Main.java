public class Main {
    public static void main(String[] args) {
        System.out.println(
                get_bigger_module(200, -8, -30)
        );
    }

    public static int get_bigger_module(int number1, int number2, int number3) {
        int bigger_module;

        if (Math.abs(number1) > Math.abs(number2)) {
            bigger_module = number1;
        } else {
            bigger_module = number2;
        }

        if (Math.abs(bigger_module) < Math.abs(number3)) {
            bigger_module = number3;
        }

        return bigger_module;
    }
}