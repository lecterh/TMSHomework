package Task27;

public class CreditCard extends DebitCard {
    private Double cashLimit;
    private Double percent;

    public Double getCashLimit() {
        return cashLimit;
    }

    public void setCashLimit(Double cashLimit) {
        this.cashLimit = cashLimit;
    }

    public CreditCard(long number, Double balance, String nameOwner, Currency currency,
                      Double cashLimit, Double percent) {
        super(number, balance, nameOwner, currency);
        this.cashLimit = cashLimit;
        this.percent = percent;
    }

    @Override
    public boolean withdrawCash(Double sum) {
        if (sum > getBalance() + getCashLimit()) {
            System.out.println("Недостаточно средств");
            return false;
        } else if (getBalance() >= sum) {
            setBalance(getBalance() - sum);
            return true;
        } else {
            System.out.println("На счету недостаточно средств.");
            System.out.printf("Будет снято %.2f со счета.\n", getBalance());
            System.out.printf("Оставшаяся сумма %.2f будет снята под %.2f  процента годовых\n", (sum - getBalance()), percent);
            setCashLimit(sum - getBalance());
            setBalance(0.0);
            return true;
        }
    }
}
