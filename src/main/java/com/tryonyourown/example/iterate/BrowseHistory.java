package com.tryonyourown.example.iterate;

public class BrowseHistory {
    private int count = 0;
    private String[] urls = new String[10];

    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    class ArrayIterator implements Iterator {
        BrowseHistory history;
        private int index = 0;
        ArrayIterator(BrowseHistory history) {
            this.history = history;
        }
        public boolean hasNext() {
            return index < history.count;
        }
        public void next() {
            if(index < history.count) {
                index++;
            }
        }
        public String current() {
            return history.urls[index];
        }
    }
}
