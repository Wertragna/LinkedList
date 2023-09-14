package org.bobocode;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LinkedListTest {

    @Test
    public void LinkedListTestClassExistAndParametrizedByTType() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("org.bobocode.linkedlist.LinkedList");
    }

}
