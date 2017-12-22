import java.util.ArrayList;

public class Branch{
    private String name;
    private ArrayList<Customer> customer = new ArrayList<>();

    public Branch(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void listCustomer(String name){
        double transaction = 0.0;
        if(customer.contains(new Customer(name, transaction))){
            int index = customer.indexOf(new Customer(name, transaction));
            customer.get(index).listTransaction();
        }

    }

    public boolean createAccount(String name, double transaction ){
        if(customer.contains(new Customer(name, transaction)))
            return false;
        else
            customer.add(new Customer(name, transaction));
        return true;
    }

    public boolean deposit(String name, double transaction){
        boolean exists = customer.contains(new Customer(name, transaction));
        if(exists){
            int index = customer.indexOf(new Customer(name, transaction));
            customer.get(index).deposit(transaction);
            return true;
        }
        return false;
    }
    public boolean withdraw(String name, double transaction){
        boolean exists = customer.contains(new Customer(name, transaction));
        if(exists){
            int index = customer.indexOf(new Customer(name, transaction));
            customer.get(index).withdraw(transaction);
            return true;
        }
        return false;
    }
}
