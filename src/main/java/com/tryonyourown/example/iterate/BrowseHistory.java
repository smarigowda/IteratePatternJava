package com.tryonyourown.example.iterate;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList();

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        int lastIndex = urls.size() - 1;
        return urls.remove(lastIndex);
    }

    class ListIterator implements Iterator {
        BrowseHistory history;
        int index = 0;
        ListIterator(BrowseHistory history) {
            this.history = history;
        }
        public boolean hasNext() {
            int urlsCount = history.urls.size();
            return index < urlsCount;
        }
        public void next() {
            index++;
        }
        public String current() {
            return history.urls.get(index);
        }
    }
}
