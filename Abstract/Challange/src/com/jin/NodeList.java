package com.jin;

public class NodeList implements LinkedList {

    private Node head = null;
    private Node root = null;
    private Node current;
    private Node newNode;

    public Node getRoot() {
        return root;
    }

    @Override
    public void addToList(Object value) {
        current = head;
        newNode = new Node(value);
        if(head == null)
            head = newNode;
        else
            while (current != null){
                if(current.compareTo(newNode) < 1){
                    if(current.getNext() !=null)
                        current = (Node) current.getNext();
                    else{
                        newNode.setPrev(current);
                        current.setNext(newNode);
                        return;
                    }
                }else if(current.compareTo(newNode) >1){
                    if(current.getPrev() != null){
                        newNode.setPrev(current.getPrev());
                        newNode.setNext(current);
                        current.getPrev().setNext(newNode);
                        current.setPrev(newNode);
                        return;
                    }
                    else
                        newNode.setNext(head);
                        head.setPrev(newNode);
                        head = newNode;
                        return;
                }
            }
    }

    @Override
    public void printItems() {
        current = head;
        while (current !=null){
            System.out.println(current.value);
            current = (Node)current.getNext();
        }
    }

    @Override
    public void removeFromList(Object value) {

    }

    @Override
    public void addToTree(Object value) {
        newNode = new Node(value);
        current = root;
        if(root == null)
            root = newNode;
        else{
            while (current!=null){
                if(current.compareTo(newNode) > 1){
                    if(current.getPrev() !=null)
                        current = (Node)current.getPrev();
                    else{
                        current.setPrev(newNode);
                        return;
                    }

                }else if(current.compareTo(newNode) <1){
                    if(current.getNext() !=null)
                        current = (Node)current.getNext();
                    else {
                        current.setNext(newNode);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if(root.getPrev() !=null)
            traverse(root.getPrev());
        System.out.println(root.value);
        if(root.getNext() !=null)
            traverse(root.getNext());
    }
}
