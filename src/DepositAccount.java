
public class DepositAccount{

    private double fixedPercent;
    private double balance;
    private Client client;

    DepositAccount(Client client, double amountMoney, double fixedPercent) {
        this.client = client;
        this.fixedPercent = fixedPercent;
        this.balance = amountMoney;

        System.out.println("\n" + "Deposit account of " + client.getFullName()
                + " with fixed percent: " + fixedPercent + "%,"
                + " with initial amount: " + amountMoney
                + " is created" );
    }

    public void addPercent() {
        balance += balance * fixedPercent / 100;
        System.out.println("\nPercents are accrued on Deposit account of " + client.getFullName() + ". Current balance: " + this.balance);
    }

    public void withdrawMoney(double amountMoney) {
        if (balance < amountMoney) {
            System.out.println("Not enough money.");
        }
        else {
            this.balance -= amountMoney;
            System.out.println("\nWithdrawal " + amountMoney + " from Deposit account from " + this.client.getFullName() + ". Current balance: " + this.balance);
        }
    }

    public void putMoney(double amountMoney) {
        this.balance += amountMoney;
        System.out.println("\nRefill " + amountMoney + " to Deposit account from " + this.client.getFullName() + ". Current balance: " + this.balance);
    }


    public double getBalance(){
        return this.balance;
    }

    public void getBalanceToString() {
        System.out.println("\nBalance of Deposit account of " + client.getFullName() + " is " + this.balance);
    }

}
