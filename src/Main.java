public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // тест 1 срок 1 год
        double payment = service.calculator(1, 1_000_000, 9.99);
        System.out.println(" Срок кредита 1 год.  Ежемесячный платеж: " + (int) payment);
        // тест 2 срок 2 года
        double payment2 = service.calculator(2, 1_000_000, 9.99);
        System.out.println(" Срок кредита 2 года. Ежемесячный платеж: " + (int) payment2);
        // тест 3 срок 3 года
        double payment3 = service.calculator(3, 1_000_000, 9.99);
        System.out.println(" Срок кредита 3 года. Ежемесячный платеж: " + (int) payment3);
    }
}

