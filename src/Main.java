public class Main {
    public static void main(String[] args) {
        int account0 = 100; //начальная сумма на счёте клиента в рублях
        int amount = 1100; //сумма пополнения счёта клиента в рублях

        int bonus = (amount > 1000) ? amount / 100 : 0;

        int account = account0 + amount + bonus;

        System.out.println("Итого на счёту клиента:");
        System.out.println(account + " рублей");

        System.out.println("Клиенту начислен бонус в размере:");
        System.out.println(bonus + " рублей");
    }
}
