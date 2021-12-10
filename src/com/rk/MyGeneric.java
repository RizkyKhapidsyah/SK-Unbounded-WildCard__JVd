/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rk;

import java.util.ArrayList;

public class MyGeneric<E> {
    private ArrayList<E> list = new ArrayList<>();

    public int getSize() {
        return list.size();
    }

    public void push(E item) {
        list.add(item);
    }

    public E pop() {
        E item = list.get(getSize() - 1);
        list.remove(getSize() - 1);

        return item;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

}
