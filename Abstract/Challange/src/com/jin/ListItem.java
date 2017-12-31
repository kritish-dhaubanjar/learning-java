package com.jin;

public abstract class ListItem {
    protected ListItem prev,next;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    public ListItem getPrev() {
        return prev;
    }

    public void setPrev(ListItem prev) {
        this.prev = prev;
    }

    public ListItem getNext() {
        return next;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public int compareTo(ListItem newNode){
        return ((String) this.value).compareTo((String) (newNode.value));
    }

}
