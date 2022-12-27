package models;

public class BillCalculator {

    public double calculateBill(double billValue, float paymentForService) {
        return billValue + paymentForService;
    }


    public double calculateBill(double billValue, float paymentForService, double discountInPercent) {
        return billValue * (1 - discountInPercent / 100) + paymentForService;
    }


    public double calculateBill(double billValue, int paymentForService, short paymentForTakeawayPackage) {
        return billValue + paymentForService + paymentForTakeawayPackage;
    }
}
