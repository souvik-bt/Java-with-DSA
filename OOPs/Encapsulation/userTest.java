package OOPs.Encapsulation;

public class userTest {
    public static void main(String[] args) {
        bankAccount souvikAccount = new bankAccount();

        // souvikAccount.setAccountNumber(34534343);
        souvikAccount.deposit(100);
        souvikAccount.withdraw(50);
        System.out.println("Balance : " + souvikAccount.getBalance());
        System.out.println(souvikAccount.getAccountNumber());
    }
}
