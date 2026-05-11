package OOPs.Encapsulation;
// two imp ideas:
// 1. bundling of properties(data/variable/variable instance) and behaviour(methods)
// 2. providing security in accessibility

public class bankAccount{

    // properties
    
    private long accountNumber;
    private double balance;

    // behaviour
    
    // 1. setter
    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;                         // thi. is not compulsory here.
            System.out.println("Deposited : " + amount);
        }else{
            System.out.println("Invalid Deposit Ammount");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn : " + amount);
        }else{
            System.out.println("Invalid amount requested or insufficient balance");
        }
    }
    public void setAccountNumber(long accountNumber){             
        this.accountNumber = accountNumber;                 // this. required if local variable = instance variable;
    }

    // 2. getter
    public long getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

}