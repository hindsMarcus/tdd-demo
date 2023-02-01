package facade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    String name = "Helge";
    Hello hello;

    @BeforeEach
    void setUp() {
        hello = new Hello();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testHello(){
        System.out.println("Method to say hello");
        String name = "Helge";
        Hello hello = new Hello();
        String actual = hello.sayHello(name);
        String expected = "Hello, Helge";
        assertEquals(actual, expected);
    }

    @Test
    public void testHelloNull(){
        System.out.println("Method to check for null");
        String actual = hello.sayHello(null);
        String expected = "Hello my friend";
        assertEquals(actual, expected);
    }

    @Test
    public void testHelloShout(){
        System.out.println("Method to check for shout");
        String actual = hello.sayHello("JERRY");
        String expected = "HELLO, JERRY!";
        assertEquals(actual, expected);
    }
/*
    @Test
    public void testHelloArray(){
        System.out.println("Method to check for array");
        String[] nameArray = {"Jill", "Jane"};
        String actual = hello.sayHello(nameArray);
        String expected = "Hello, Jill and Jane";
        assertEquals(actual, expected);
    }

    @Test
    public void testHelloArrayArbitrary(){
        System.out.println("Method to check for arbitrary names");
        String[] nameArray = {"Jill", "Jane", "Charlotte"};
        String actual = hello.sayHello(nameArray);
        String expected = "Hello, Jill, Jane, and Charlotte";
        assertEquals(actual, expected);
    }

    */
}