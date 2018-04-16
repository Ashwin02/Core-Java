public class BankAccount {

    private String accountNum;
    private int balance;
    private String name;
    private String email;
    private int phone;

    public BankAccount(){
        this("1111",50,"Default name","Default email",11111111);
    }


    public BankAccount(String accountNum, int balance, String name,String email, int phone){
        this.accountNum = accountNum;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void depositFunds(int funds){
        this.balance += funds;
        System.out.println("Total balance after deposit "+this.balance);
    }

    public void withdrawFunds(int amount){
        if(this.balance > amount){
            this.balance -= amount;
            System.out.println("Total balance left "+this.balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }



}
