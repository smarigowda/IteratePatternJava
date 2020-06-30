package com.tryonyourown.example;

import com.tryonyourown.example.iterate.BrowseHistory;

/**
 * Hello Iterator Pattern!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Iterator Pattern!" );
        var browseHistory = new BrowseHistory();
        browseHistory.push("url 1");
        browseHistory.push("url 2");
        browseHistory.push("url 3");
        browseHistory.push("url 4");
        browseHistory.pop();
        browseHistory.push("url 5");

        var history = browseHistory.createIterator();

        while(history.hasNext()) {
            System.out.println(history.current());
            history.next();
        }
    }
}
