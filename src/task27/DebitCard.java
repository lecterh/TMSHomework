package Task27;

public class DebitCard extends Card {
    private String nameOwner;
    private Double balance;

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public Double getBalance() {
        return balance;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public DebitCard(long number, Double balance, String nameOwner, Currency currency) {
        super(number, currency);
        this.nameOwner = nameOwner;
        this.balance = balance;
    }

    public boolean withdrawCash(Double sum) {
        if (balance >= sum) {
            balance -= sum;
            return true;
        }
        else {
            return false;
        }
    }
}
