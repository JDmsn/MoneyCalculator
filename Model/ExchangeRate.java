package MoneyCalculator.Model;

public class ExchangeRate {
    private final Currency from;
    private final Currency to;
    private final double rate;

    public ExchangeRate(Currency from, Currency to, double rate) {
        this.from = from;
        this.to = to;
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public Currency getTo() {
        return to;
    }

    public Currency getFrom() {
        return from;
    }
}
