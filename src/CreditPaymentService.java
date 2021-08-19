public class CreditPaymentService {
    public double calculate(int creditPeriod, int creditAmount, double interestRate) {
        // a - ежемесячный ануитентный платёж
        // ps - процентная ставка в месяц
        // m - срок кредита в месяцах

        double ps = interestRate / (100*12);
        int m = creditPeriod * 12;
        double a = creditAmount * ps / (1-(Math.pow(1+ps,-m)));
        return (a);
    }
}
