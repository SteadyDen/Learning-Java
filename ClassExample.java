public class ClassExample {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(0, 0, "0", 0, true, 0);
        account.changePassword(123);
        System.out.println(account.getPassword());
    }
}
