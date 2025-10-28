package com.bortnik.patterns.behavioral.iterator;

/**
 * The Iterator pattern provides a unified interface for consistent access to collection items,
 * without exposing them from the inside
 */
public class IteratorDemo {
    public static void demonstrate() {
        System.out.println("=== Demo Iterator Pattern ===");
        NameCollection collection = new NameCollection();
        collection.add("Bob");
        collection.add("John");
        collection.add("David");
        Iterator<String> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
