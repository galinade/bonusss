public class Main {

    public static void main(String[] args) {

        int check = 100; //рублей
        int sum = 1100; //рублей
        int bonus;
        if (sum > 1000) {
            bonus = sum / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Бонус:" + bonus);
        System.out.println("Итоговая сумма:" + (check + sum + bonus));

    }
}
