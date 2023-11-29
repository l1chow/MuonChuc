package accountmanagement;

public class Account {
    private String ownerName;
    private double balance;

    public Account() {
        this.ownerName = "Unassigned";
        this.balance = 0;
    }
    
    public void add(double amt) {
        balance = balance + amt;
    }
    
    public void deduct(double amt) {
        balance = balance - amt;
    }
    
    public double getCurrentBalance( ) {
        return balance;
    }
    
    public String getOwnerName( ) {
        return ownerName;
    }
    
    public void setInitialBalance(double bal) {
        balance = bal;
    }
    public void setOwnerName(String name) {
        ownerName = name;
    }
}
