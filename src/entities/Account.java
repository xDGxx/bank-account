package entities;

public class Account {

    private int number;
    private String holder;
    private double balance;


    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        //Como a conta começa zerada, precisamos obter o valor inicial de deposito
        deposit(initialDeposit);
    }

    //O saldo da conta só pode ser alterado por meio de deposito, por isso set não é aplicado para saldo.

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }


    //Operação de deposito com valor adicionado a balance
    public void deposit(double amount){
        balance += amount;
    }

    //Operação de saque com o valor em balance mais a taxa de 5$
    public void withdraw(double amount){
        balance -= amount + 5;
    }

    public String toString(){
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: "
                + String.format("%.2f", balance)
                + " R$";
    }

}
