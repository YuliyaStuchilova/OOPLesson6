package org.example.tast2;

import java.util.List;

public class MutableList<T> extends AbstractList<T> {



    // MutableList<T> — коллекция, которая допускает изменения. Методы:
//• getSize ()
//• get (int i)
//• set (int i, T newValue)
//• add (T newValue)
//• remove (T value)

    public MutableList(List<T> list) {
        super(list);
    }
    public void set(int i, T newValue) {
        super.getList().set(i,newValue);

    }

    public void add(T newValue) {
        super.getList().add(newValue);
    }

    public void remove(T value) {
        super.getList().remove(value);
    }
}
