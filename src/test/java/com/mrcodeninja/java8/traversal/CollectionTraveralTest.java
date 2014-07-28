package com.mrcodeninja.java8.traversal;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author mrcodeninja
 */
public class CollectionTraveralTest {
    @Test
    public void forEach() {
        List<String> helloWorldList = Arrays.asList("Hello", ", ", "World!");

        helloWorldList.forEach(System.out::print);
    }
}
