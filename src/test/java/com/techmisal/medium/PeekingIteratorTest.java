package com.techmisal.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PeekingIteratorTest {

    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

    @Test
    public void testNextAndPeek() {
        PeekingIterator peekingIterator = new PeekingIterator(integers.iterator());
        Assert.assertEquals(1, peekingIterator.next());
        Assert.assertEquals(2, peekingIterator.peek());
        Assert.assertEquals(2, peekingIterator.peek());
        Assert.assertEquals(2, peekingIterator.next());
        Assert.assertEquals(3, peekingIterator.next());
        Assert.assertEquals(4, peekingIterator.peek());
        Assert.assertEquals(4, peekingIterator.peek());
        Assert.assertEquals(4, peekingIterator.next());
        Assert.assertEquals(5, peekingIterator.next());
        Assert.assertNull(peekingIterator.peek());
        Assert.assertNull(peekingIterator.next());
        Assert.assertFalse(peekingIterator.hasNext());
    }

}