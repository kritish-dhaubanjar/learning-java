public class Main {

    public static ListItem head;
    public static ListItem newNode;
    public static ListItem current;

    public static void main(String [] args){
        String content = "I would buy your life, if you would sell.";
        String [] words = content.split(" ");
        for(String word : words){
            add(word);
        }
        //list();
        remove("I");
        remove("sell.");
        list();
    }

    public static void add(String content){
        newNode = new ListItem(content);
        if(head == null){
            head = newNode;
        }else{
            current = head;
            while (current.getNext() != null){
                current=current.getNext();
            }
            newNode.setPrev(current);
            current.setNext(newNode);
        }
    }

    public static void list(){
        current = head;
        while (current.getNext() !=null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
        System.out.println(current.getValue());
//        System.out.println("****************");
//        while (current.getPrev() != null){
//            System.out.println(current.getValue());
//            current = current.getPrev();
//        }
//        System.out.println(current.getValue());
    }

    public static void remove(String item){
        current = head;
        while (! current.getValue().equals(item)){
            current = current.getNext();
        }

//        System.out.println(current.getPrev().getValue());
//        System.out.println(current.getValue());
//        System.out.println(current.getNext().getValue());
        if(head == current){
            head = current.getNext();
            head.setPrev(null);
        }else if(current.getNext() == null){
            current.getPrev().setNext(null);
        }
        else{
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
        }
    }


}
