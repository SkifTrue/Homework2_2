public class Main {
    public static void main(String[] args) {

        int x = 100; // Изначально
        int y = 1001; // Пополнение

        int w = y / 100; // Расчет бонусов
        int q = y > 1000 ? (w) : (0);
        int z = x + y + q; // Общее

        System.out.println("Общая сумма на счету " + z);

        System.out.println("Пополнение на сумму " + y);

        System.out.println("Колличество бонусных рублей " + q);
    }
}