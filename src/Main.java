public class Main {
    public static void main(String[] args) {

        int deposit = 500;  // начальный счет
        int replenishment = 900;  // сумма пополнения

        int bonus = replenishment > 1000 ? replenishment / 100 : 0;

//        int bonus;
//        if (replenishment > 1000) {
//            bonus = replenishment / 100;
//        }
//        else {
//            bonus = 0;
//        }


        System.out.println("Количество бонусов " + bonus);
        System.out.println("Итоговая сумма " + (deposit + bonus));

    }
}