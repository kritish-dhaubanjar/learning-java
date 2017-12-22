import java.util.ArrayList;
import java.util.Objects;

public class Customer{
    private String name;
    private ArrayList<Double> deposit = new ArrayList<>();
    private ArrayList<Double> withdraw = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Customer(String name, double transaction){
        this.name = name;
        this.deposit.add(transaction);
        this.withdraw.add(0.0);
    }

    public void deposit(double transaction){
        this.deposit.add(transaction);
    }
    public void withdraw(double transaction){
        this.withdraw.add(transaction);
    }

    public String getName(){
        return this.name;
    }
    public void listTransaction(){
        System.out.println("Deposit");
        for(int i=0; i<deposit.size(); i++){
            System.out.println(deposit.get(i).doubleValue());
        }
        System.out.println("Withdraw");
        for(int i=0; i<withdraw.size(); i++){
            System.out.println(withdraw.get(i).doubleValue());
        }
    }

}
