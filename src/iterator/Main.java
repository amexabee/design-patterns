package iterator;

public class Main {
    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        var iterator = history.createIterator();
        iterator.next();
        iterator.next();
        iterator.next();
        System.out.println(iterator.current());
        System.out.println(iterator.hasNext());
    }
}
