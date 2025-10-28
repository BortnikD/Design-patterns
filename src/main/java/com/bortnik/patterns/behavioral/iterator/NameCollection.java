package com.bortnik.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class NameCollection implements IterableCollection<String> {
    private final List<String> names = new ArrayList<>();

    public void add(String name) {
        names.add(name);
    }

    @Override
    public Iterator<String> createIterator() {
        return new NameIterator(names);
    }
}
