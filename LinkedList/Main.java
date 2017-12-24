import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class Main{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<String>();
        add(places, "KTM");
        add(places, "Bhaktapur");
        add(places, "Pokhara");
        add(places, "Lalitpur");
        add(places, "AK47");
        add(places, "AK47");
        print(places);
        visit(places);
    }

    private static void print(LinkedList<String> list){
        Iterator<String> i = list.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }

    private static boolean add(LinkedList<String> list, String name){
        ListIterator<String> i = list.listIterator();
        if(list.isEmpty()){
            list.add(name);
            return true;
        }

        while(i.hasNext()){
            int compare = i.next().compareTo(name);
            if (compare == 0) {
                System.out.println("Already Exists");
                return false;
            }
            else if(compare > 0){
                i.previous();
                i.add(name);
                return true;
            }else{
            }
        }
        i.add(name);
        return true;
    }

    public static void visit(LinkedList<String> list){
        if(list.isEmpty()) {
            System.out.println("Empty");
            return;
        }
        boolean fwd = true;
        ListIterator<String> i = list.listIterator();
        while(true){
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    if(!fwd){
                        i.next();
                    }
                    if(i.hasNext()){
                        System.out.println(i.next());
                        fwd = true;
                    }
                    break;
                case 2:
                    if(fwd){
                        i.previous();
                    }
                    if(i.hasPrevious()){
                        System.out.println(i.previous());
                        fwd = false;
                    }
                    break;
            }
        }
    }
}