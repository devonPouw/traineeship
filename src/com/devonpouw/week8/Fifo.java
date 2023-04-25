package com.devonpouw.week8;

import java.util.ArrayList;
import java.util.Collections;

public class Fifo implements Queue {
    ArrayList<Integer> fifoQueue = new ArrayList<>();

    @Override
    public void add(int value) {
        fifoQueue.add(value);
    }

    @Override
    public int remove() {
        return fifoQueue.remove(indexOf(0));
    }

    @Override
    public int peek() {
        return fifoQueue.indexOf(0);
    }

    @Override
    public boolean isEmpty() {
        return fifoQueue.size() == 0;
    }

    @Override
    public int size() {
        return fifoQueue.size();
    }

    @Override
    public void print() {
        System.out.println(fifoQueue);
    }

    @Override
    public void clear() {
        fifoQueue.clear();
    }

    @Override
    public void clear(int n) {
        fifoQueue.remove(n);
    }

    @Override
    public void printReverse() {
        Collections.reverse(fifoQueue);
        System.out.println(fifoQueue);
    }

    @Override
    public void jumpTheQueue(int n, int value) {
        fifoQueue.set(n, value);
    }

    @Override
    public String toString() {
        return fifoQueue.toString();
    }

    @Override
    public boolean equals(Queue q) {
        return fifoQueue.toString().equals(q.toString());
    }

    @Override
    public int indexOf(int value) {
        return fifoQueue.indexOf(value);
    }

    @Override
    public int lastIndexOf(int value) {
        return fifoQueue.lastIndexOf(value);
    }
}