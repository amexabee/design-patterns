package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    //    private List<String> urls = new ArrayList<>();
    private String[] urls = new String[10];
    private int count;

    public void push(String url) {
//        urls.add(url);
        urls[count++] = url;
    }

    public String pop() {
//        var index = urls.size() - 1;
//        var last = urls.get(index);
//        urls.remove(last);
        return urls[--count];
    }

    public Iterator<String> createIterator() {
//        return new ListIterator(this);
        return new ArrayIterator(this);
    }

//    public class ListIterator implements Iterator<String>{
//        private BrowseHistory history;
//        private int index;
//
//        public ListIterator(BrowseHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public boolean isDone() {
//            return (index < history.urls.size() - 1);
//        }
//
//        @Override
//        public String current() {
//            return history.urls.get(index);
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//    }

    public class ArrayIterator implements Iterator<String>{
        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.count - 1;
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }

}
