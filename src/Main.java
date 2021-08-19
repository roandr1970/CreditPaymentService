public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPayment1 = service.calculate(1,1_000_000, 9.99);
        System.out.println(Math.round(monthlyPayment1));

        double monthlyPayment2 = service.calculate(2,1_000_000, 9.99);
        System.out.println(Math.round(monthlyPayment2));

        double monthlyPayment3 = service.calculate(3,1_000_000, 9.99);
        System.out.println(Math.round(monthlyPayment3));
    }
}
