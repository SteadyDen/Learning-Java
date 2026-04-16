public class SavingAcoount extends BankAccount implements WithDrawble {

    boolean isOverdraft;
    void transfer() {};

    SavingAcoount() {
        super(0, 0, "0", 0, true, 0);
    }

    public void withdraw() {
        System.out.println("Withdraw");
    }
}
