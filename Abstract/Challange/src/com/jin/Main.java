package com.jin;

public class Main {

    public static void main(String[] args) {
        NodeList list = new NodeList();
        list.addToList("Obey");
        list.addToList("Master");
        list.addToList("your");
        list.addToList("scream");
        list.addToList("of");
        list.addToList("puppets");
        list.printItems();
        list.addToTree("Obey");
        list.addToTree("Master");
        list.addToTree("your");
        list.addToTree("scream");
        list.addToTree("of");
        list.addToTree("puppets");
        list.traverse(list.getRoot());
    }
}
