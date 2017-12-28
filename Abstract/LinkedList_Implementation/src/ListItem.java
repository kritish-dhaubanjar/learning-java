public class ListItem {
    private ListItem prev;
    private ListItem next;
    private String value;


    public ListItem(String value) {
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

    public String getValue() {
        return value;
    }
}
