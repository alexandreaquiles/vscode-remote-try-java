package com.mycompany.app;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void newLinkedListShouldHaveZeroAsSize() {
       var list = new LinkedList();
       int size = list.size();
        Assert.assertEquals(0, size);
    }

    @Test
    public void whenAddedOneElementShouldHaveOneAsSize() {
       var list = new LinkedList();
       list.add(1);
       int size = list.size();
        Assert.assertEquals(1, size);
    }

    @Test
    public void whenAddedOneElementShouldGetIt() {
       var list = new LinkedList();
       list.add(1);
       int element = list.get(0);
        Assert.assertEquals(1, element);
    }

    @Test
    public void whenAddingTwoElementShouldGetBoth() {
       var list = new LinkedList();
       list.add(1);
       list.add(2);
       Assert.assertEquals(2, list.size());

       int first = list.get(0);
        Assert.assertEquals(1, first);

        int second = list.get(1);
        Assert.assertEquals(2, second);
    }

    @Test
    public void shouldGetByIndex() {
       var list = new LinkedList();
       list.add(13);
       list.add(2);
       list.add(18);
       list.add(9);
       list.add(7);

       int element = list.get(3);
        Assert.assertEquals(9, element);
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowExceptionIfIndexGreaterThanSize() {
       var list = new LinkedList();
       list.add(9);

       list.get(3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowExceptionIfIndexIsNegative() {
       var list = new LinkedList();
       list.get(-3);
    }

}
