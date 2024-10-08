package Problem3;

// Money.java
public class Money {
    private double amount;

    // Constructor
    public Money(double amount) {
        this.amount = amount;
    }

    // Copy Constructor
    public Money(Money money) {
        this.amount = money.amount;
    }

    // Getters
    public double getAmount() {
        return amount;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("$%.2f", amount);
    }
}
