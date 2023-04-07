public class Main {
    public static void main(String[] args) {

        int moneyFrst = 100; // Изначальное колличество денег на счету
        int refill = 1001; // Пополнение

        int bonus = refill / 100; // Бонусы
        int bonusCalc = refill > 1000 ? (bonus) : (0); // Расчет бонусов
        int full = moneyFrst + refill + bonusCalc; // Общее колличество денег на счету

        System.out.println("Общая сумма на счету " + full);

        System.out.println("Пополнение на сумму " + refill);

        System.out.println("Колличество бонусных рублей " + bonusCalc);
    }
}