package org.example.tast2;

import java.util.List;

public class ImmutableList<T> extends AbstractList<T> {

    // ImmutableList<T> — коллекция, которая никогда ни при каких обстоятельствах
// не меняется. Методы:
// • getSize ()
// • get (int i)

    public ImmutableList(List<T> list) {
        super(list);
    }



}
