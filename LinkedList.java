
public class LinkedList<T> {
    private ListItem<T> firstItem;
    private ListItem<T> lastItem;

    LinkedList() {
        firstItem = null;
        lastItem = null;
    }

    LinkedList(ListItem<T> firstItem){
        this.firstItem = firstItem;
        lastItem = firstItem;
    }
    public void setFirstItem(ListItem<T> firstItem){
        this.firstItem = firstItem;
    }
    public void addNewItem(ListItem<T> newItem){
        lastItem.next = newItem;
        lastItem = newItem;
    }
    public void insertAfter(ListItem<T> existingItem, ListItem<T> newItem) {
        ListItem<T> next = existingItem.next;
        existingItem.next = newItem;
        newItem.next = next;
    }
    public void deleteAfter(ListItem<T> existingItem) {
        ListItem<T> firstAfter = existingItem.next;
        ListItem<T> secondAfter = firstAfter.next;
        existingItem.next = secondAfter;
    }


    public ListItem<T> getFirstItem(){
        return firstItem;
    }
    public ListItem<T> getLastItem(){
        return lastItem;
    }
}