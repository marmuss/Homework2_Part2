import java.util.Scanner;

public class Homework2_Deposit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите сумму вклада:");
        float deposit = input.nextFloat();

        System.out.println("Введите количество месяцев:");
        int month = input.nextInt();

        for(;month >0; month--){
            deposit += deposit * 7 / 100;
        }

        System.out.println("Через "+ month + " месяцев сумма вашего вклада будет " + deposit);
    }
}
