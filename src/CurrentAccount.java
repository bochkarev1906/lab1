public class CurrentAccount {

    private double balance;
    private Client client;

    CurrentAccount(Client client, double amountMoney) {
        this.client = client;
        this.balance = amountMoney;
        System.out.println("\n" + "Current account of " + client.getFullName() + " with initial amount: " + amountMoney + " is created" );
    }

    void putMoney(double amountMoney) {
        this.balance += amountMoney;
        System.out.println("\nRefill " + amountMoney + " to Current account from " + this.client.getFullName() + ". Current balance: " + this.balance);
    }

    void withdrawMoney(double amountMoney){
        if(this.balance < amountMoney){
            System.out.println("Not enough money.");
        }
        else{
            this.balance -= amountMoney;
            System.out.println("\nWithdrawal " + amountMoney + " from Current account from " + this.client.getFullName() + ". Current balance: " + this.balance);
        }

    }

    public double getBalance(){
        return this.balance;
    }

    public void getBalanceToString() {
        System.out.println("\nBalance of Current account of " + client.getFullName() + " is " + this.balance);
    }

}
