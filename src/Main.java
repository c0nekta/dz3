public class Main {
    public static void main(String[] args) {

        int balance = 443; // баланс клиента
        int sum = 1009; // сумма пополнения
        int bonus = sum / 100; // бонус при пополнении баланса


        System.out.println("Ваш баланс пополнен на: " + sum);

        if (sum >= 1000) {

            System.out.println("Ваш бонус составил: " + bonus);
        } else {

            bonus = 0;
        }
        int total = balance + sum + bonus;

        System.out.println("Ваш баланс составляет: " + total);


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}