package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.ArrayDeque;
import java.util.SortedSet;
import java.util.TreeSet;

public class SequencedCollections {
    
    public static void main(String[] args) {

        // List
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Deque
        Deque<String> deque = new ArrayDeque<>();
        deque.add("A");
        deque.add("B");
        deque.add("C");

        // SortedSet
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("A");
        sortedSet.add("B");
        sortedSet.add("C");

        // LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");

        // Get first elements

        System.out.println("ArrayList: " + list.get(0) + " - " + list.getFirst());
        System.out.println("ArrayDeque: " + deque.getFirst() + " - " + deque.getFirst());
        System.out.println("TreeSet: " + sortedSet.first() + " - " + sortedSet.getFirst());
        System.out.println("LinkedHashSet: " + linkedHashSet.iterator().next() + " - " + linkedHashSet.getFirst());

        System.out.println();

        // Get last elements
        System.out.println("ArrayList: " + list.get(list.size() - 1) + " - " + list.getLast());
        System.out.println("ArrayDeque: " + deque.getLast() + " - " + deque.getLast());
        System.out.println("TreeSet: " + sortedSet.last() + " - " + sortedSet.getLast());
        System.out.println("LinkedHashSet: ? - " + linkedHashSet.getLast());

    }

}
