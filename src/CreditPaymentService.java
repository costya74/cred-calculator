public class CreditPaymentService {
    public double calculator(double numberOfYears, double summa, double rate) {
        double monthpercent = rate / 12 / 100; // месячный процент
        double payment = summa * monthpercent /
                (1 - 1 / Math.pow(1 + monthpercent, numberOfYears * 12));

        return payment;
    }
}
