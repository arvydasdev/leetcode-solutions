package com.techmisal.medium;

import java.util.Iterator;

/*
 Given an Iterator class interface with methods: next() and hasNext(), design and implement a PeekingIterator that support the peek() operation -- it essentially peek() at the element that will be returned by the next call to next().

 Example:

 Assume that the iterator is initialized to the beginning of the list: [1,2,3].

 Call next() gets you 1, the first element in the list.
 Now you call peek() and it returns 2, the next element. Calling next() after that still return 2.
 You call next() the final time and it returns 3, the last element.
 Calling hasNext() after that should return false.
 */
public class PeekingIterator<E> implements Iterator<E> {

    private Iterator<? extends E> iterator;
    private E currentElement;

    public PeekingIterator(Iterator<? extends E> iterator) {
        this.iterator = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public E peek() {
        if (currentElement == null && hasNext()) {
            currentElement = iterator.next();
        }
        return currentElement;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public E next() {
        E result = currentElement != null ? currentElement : hasNext() ? iterator.next() : null;
        currentElement = null;
        return result;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
}
