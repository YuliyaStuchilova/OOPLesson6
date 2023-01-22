package org.example.tast2;

import java.util.List;

public abstract class AbstractList <T> {
    private List<T> list;

    public AbstractList(List<T> list) {
        this.list = list;
    }

    public void getSize(){
        System.out.println(list.size());
    };
    public void get(int i){
        System.out.println(list.get(i));
    };

    public List<T> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "list=" + list ;
    }
}
