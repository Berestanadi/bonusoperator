public class Main {
    public static void main(String[] args) {
        // входные данные
        int account = 100;
        int payment = 1400;

        // логика программы
        int percent;
        if (payment > 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = payment / 100 * percent;

        int balance = account + payment + bonus;

        System.out.println("Спасибо за платеж. Ваш баланс:" + balance);
    }
}
