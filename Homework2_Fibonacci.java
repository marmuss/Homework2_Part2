public class Homework2_Fibonacci {
    public static void main(String[] args) {
        int number0 = 0;
        int number1 = 1;
        int number2;
        System.out.print(number0 +" " + number1 + " ");

        for (int count = 3; count <= 11; count++){
            number2 = number0 + number1;
            System.out.print(number2 + " ");
            number0 = number1;
            number1 = number2;
        }
    }
}
