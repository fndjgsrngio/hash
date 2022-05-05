
public class ListItem<T> {
    public T element;
    public ListItem<T> next;

    ListItem (T element, ListItem<T> next) {
        this.element = element;
        this.next = next;
    }
}