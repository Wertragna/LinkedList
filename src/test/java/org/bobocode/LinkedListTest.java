package org.bobocode;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.lang.reflect.TypeVariable;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LinkedListTest {

    @Test
    public void linkedListTestClassExists() throws ClassNotFoundException {
        Class.forName("org.bobocode.linkedlist.LinkedList");
    }

    @Test
    public void linkedListTestClassExistsAndParametrizedByTValue() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("org.bobocode.linkedlist.LinkedList");
        TypeVariable<? extends Class<?>>[] typeParameters = aClass.getTypeParameters();
        TypeVariable<? extends Class<?>> typeParameter = typeParameters[0];
        assertThat(typeParameters.length).isEqualTo(1);
        TypeVariable<? extends Class<?>> firstParam = typeParameters[0];
        assertThat(firstParam.getName()).isEqualTo("T");


    }

}
