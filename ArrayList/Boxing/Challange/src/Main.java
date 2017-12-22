import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static Bank bank = new Bank("World Bank");

    public static void main(String [] args){
        boolean cont = true;
        int choice;
        while (cont){
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Branch Name:");
                    String branchName = scan.next();
                    System.out.println(branchName);
                    bank.addBranch(branchName);
                    break;
                case 2:
                    System.out.println("Branch List:");
                    bank.listBranch();
                    break;
                case 3:
                    System.out.print("Branch Index:");
                    int index = scan.nextInt();
                    System.out.print("Name:");
                    String name = scan.next(); scan.nextLine();
                    System.out.print("Transaction:");
                    double transaction = scan.nextDouble();
                    index--;
                    bank.createCustomer(index, name, transaction);
                    break;
                case 4:
                    System.out.print("Branch Index:");
                    index = scan.nextInt();
                    System.out.print("Name:");
                    name = scan.next(); scan.nextLine();
                    System.out.print("Deposit:");
                    transaction = scan.nextDouble();
                    index--;
                    bank.deposit(index, name, transaction);
                    break;
                case 5:
                    System.out.print("Branch Index:");
                    index = scan.nextInt();
                    System.out.print("Name:");
                    name = scan.next(); scan.nextLine();
                    System.out.print("Withdraw:");
                    transaction = scan.nextDouble();
                    index--;
                    bank.withdraw(index, name, transaction);
                    break;
                case 6:
                    System.out.print("Branch Index:");
                    index = scan.nextInt();
                    System.out.print("Name:");
                    name = scan.next(); scan.nextLine();
                    index--;
                    bank.listCustomer(index, name);
                    break;
                case 10:
                    cont = false;
                    break;
            }
        }
    }
}
