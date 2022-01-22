package bank;

// We can not have two public class in same file.....
class Account {
    public String name;
    protected String email;
    private String password;

    public String getpassword() {
        return this.password; // getter in java is used to access the private things..
    }

    public void setpassword(String pass) {
        this.password = pass;
    }
}

public class Bank {
    public static void main(String args[]) {
        Account account1 = new Account();
        account1.name = "customer1";
        account1.setpassword("abcd");
        System.out.println(account1.getpassword());
    }

}
