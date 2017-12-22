import java.util.ArrayList;

public class Bank{
    private String name;
    private ArrayList<Branch> branch = new ArrayList<>();

    public Bank(String name){
        this.name = name;
    }

    public void addBranch(String name){
        branch.add(new Branch(name));
    }
    public void listBranch(){
        for(int i = 0; i<branch.size(); i++){
            System.out.println((i+1) + "." + branch.get(i).getName() );
        }
    }
    public void createCustomer(int index, String name, double transaction){
        boolean success = branch.get(index).createAccount(name, transaction);
        System.out.println(success);
    }
    public void deposit(int index, String name, double transaction){
        boolean success = branch.get(index).deposit(name, transaction);
        System.out.println(success);
    }
    public void withdraw(int index, String name, double transaction){
        boolean success = branch.get(index).withdraw(name, transaction);
        System.out.println(success);
    }
    public void listCustomer(int index, String name){
        branch.get(index).listCustomer(name);
    }
}
