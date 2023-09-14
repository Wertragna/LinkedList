package org.bobocode;


import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.junit.jupiter.api.TestMethodOrder;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import java.lang.reflect.TypeVariable;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LinkedListTest {

    @Test
    public void LinkedListTestClassExistAndParametrizedByTType() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("org.bobocode.linkedlist.LinkedList");
        TypeVariable<? extends Class<?>>[] typeParameters = aClass.getTypeParameters();

    }

}
