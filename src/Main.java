public class Main {

    public static void main(String[] args) {
        int check = 220;
        int replenishment = 3300;
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        int result = check + replenishment + bonus;

        System.out.println("Бонусные рубли:" + bonus);
        System.out.println("Итоговый счет:" + result);
    }
}
