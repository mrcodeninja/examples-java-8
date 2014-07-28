package com.mrcodeninja.java8.lambda;

import org.junit.Test;

/**
 * @author mrcodeninja
 */
public class HelloWorldTest {
    @Test
    public void classicRunnable() {
        Runnable helloWorldRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, World!");
            }
        };

        new Thread(helloWorldRunnable).start();
    }

    @Test
    public void lambdaRunnable() {
        Runnable helloWorldRunnable = () -> System.out.println("Hello, World!");

        new Thread(helloWorldRunnable).start();
    }
}
