package MoneyCalculator.Model;

public class Money {
    private final Currency currency;
    private final double quantity;

    public Money(double quantity, Currency currency) {
        this.amount = quantity;
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return quantity;
    }
}
