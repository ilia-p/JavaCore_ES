package com.iliapetrov1982.javacore.chapter18;

import java.util.TreeSet;

class CompDemo2 {
    public static void main(String[] args) {
// Pass a reverse comparator to TreeSet() via a
// lambda expression.
        TreeSet<String> ts = new TreeSet<String>(
                (aStr, bStr) -> bStr.compareTo(aStr));
// Add elements to the tree set.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
// Display the elements.
        for (String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}
