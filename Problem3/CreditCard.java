package Problem3;
// CreditCard.java

public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Constructor
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.balance = new Money(0);
        this.creditLimit = new Money(creditLimit);
    }

    // Accessor methods
    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    // Charge method
    public void charge(Money amount) {
        double newBalance = balance.getAmount() + amount.getAmount();
        if (newBalance <= creditLimit.getAmount()) {
            balance = new Money(newBalance);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Payment method
    public void payment(Money amount) {
        double newBalance = balance.getAmount() - amount.getAmount();
        balance = new Money(newBalance);
        System.out.println("Payment: " + amount);
    }
}
