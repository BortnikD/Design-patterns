package com.bortnik.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + color + texture;

        if (treeTypes.containsKey(key)) {
            return treeTypes.get(key);
        }
        else {
            TreeType treeType = new TreeType(name, color, texture);
            treeTypes.put(key, treeType);
            System.out.println("Tree type created: " + name + " " + color + " " + texture);
            return treeType;
        }
    }
}
