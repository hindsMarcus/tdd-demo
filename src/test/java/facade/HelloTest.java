package facade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

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
        System.out.println("method to say hello");
        Hello hello = new Hello();
        String actual = hello.sayHello(name);
        String expected = "Hello, " + name + ".";
        assertEquals(expected,actual);
    }
    @Test
    public void testHelloNull(){
        System.out.println("method to check for null");
        String actual = hello.sayHello(null);
        String expected = "Hello, my friend.";
        assertEquals(expected,actual);
    }
    @Test
    public void testHelloShout(){
        System.out.println("method to check for shout");
        String actual = hello.sayHello("JERRY");
        String expected = "HELLO, JERRY!";
        assertEquals(expected,actual);
    }
    @Test
    public void testHelloArray(){
        System.out.println("method to check for helloarray");
        String[] nameArray = {"Jill", "Jane"};
        String actual = hello.sayHello(nameArray);
        String expected = "Hello, Jill and Jane.";
        assertEquals(expected,actual);
    }
    @Test
    public void testHelloArrayArbitrary(){
        System.out.println("method to check for arbritary names");
        String[] nameArray = {"Amy", "Brian", "Charlotte"};
        String actual = hello.sayHello(nameArray);
        String expected = "Hello, Amy, Brian, and Charlotte.";
        assertEquals(expected,actual);
    }
    @Test
    public void testHelloArrayMixed(){
        System.out.println("method to check for arbritary AND MIXED names");
        String[] nameArray = {"Amy", "BRIAN", "Charlotte"};
        String actual = hello.sayHello(nameArray);
        String expected = "Hello, Amy and Charlotte. AND HELLO BRIAN!";
        assertEquals(expected,actual);
    }
    @Test
    public void testHelloCommaSplit(){
        System.out.println("method to check for comma split");
        String[] nameArray = {"Bob", "Charlie,Dianne"};
        String actual = hello.sayHello(nameArray);
        String expected = "Hello, Bob, Charlie, and Dianne.";
        assertEquals(expected,actual);
    }



}
