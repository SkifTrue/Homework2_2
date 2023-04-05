public class Main {
    public static void main(String[] args) {

        int money1 = 100; // Изначальное колличество денег на счету
        int refill = 1001; // Пополнение

        int bonus = refill / 100; // Бонусы
        int bonus_calc = refill > 1000 ? (bonus) : (0); // Расчет бонусов
        int full = money1 + refill + bonus_calc; // Общее колличество денег на счету

        System.out.println("Общая сумма на счету " + full);

        System.out.println("Пополнение на сумму " + refill);

        System.out.println("Колличество бонусных рублей " + bonus_calc);
    }
}