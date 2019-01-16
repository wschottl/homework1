package IUS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    LinkedList<String> tester;
    LinkedList<String> test;
    LinkedList<String> add;
    LinkedList<String> results;

    @Before
    public void setup() throws Exception{
        test = new LinkedList<>();
        tester = new LinkedList<>();
        add = new LinkedList<>();
        results = new LinkedList<>();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
        tester = null;
        add = null;
        results = null;
    }

    @Test
    public void next() {
        tester.data = "test2";
        test.data = "test1";
        test.append(tester);

        results.next = test.next();

        System.out.println("Finding the next element in the list");
        assertEquals(test.next, results.next);
    }

    @Test
    public void last() {
        tester.data = "test2";
        test.data = "test1";
        add.data = "test3";
        test.append(tester);
        test.append(add);

        results.next = test.last();

        System.out.println("find the last element in a list");
        assertEquals(tester.next, results.next);
    }

    @Test
    public void after() {
        tester.data = "test2";
        test.data = "test1";
        add.data = "test3";
        test.append(tester);
        test.append(add);

        results.next = test.after(2);

        System.out.println("find what comes after tester");
        assertEquals(tester.next, results.next);
    }

    @Test
    public void after2() {
        tester.data = "test2";
        test.data = "test1";
        add.data = "test3";
        test.append(tester);
        test.append(add);

        results.next = test.after(1);

        System.out.println("Find what comes after test");
        assertEquals(test.next, results.next);
    }

    @Test
    public void detach2() {
        tester.data = "detachthis";
        test.data = "keepthis";
        test.setNext(tester);

        test.detach();

        System.out.println("Testing a 2 length long detaching the last");
        assertEquals(null, test.next);
    }

    @Test
    public void detach3(){
        test.data = "test1";
        tester.data = "test2";
        add.data = "test3";
        test.setNext(tester);
        test.append(add);

        test.detach();

        System.out.println("Testing a 3 length long detaching after test");
        assertEquals(null, test.next);
    }

    @Test
    public void get() {
        test.data = "test1";
        String expected = "test1";
        assertEquals(expected, test.get());

    }

    @Test
    public void set() {
        test.set("Test1");
        assertEquals("Test1",test.get());
    }

    @Test
    public void setNext() {
        test.data = "setNext";
        tester.data = "Nextset";

        test.setNext(tester);

        System.out.println("setting Nextset after setNext");

        assertEquals("Nextset", test.next().get());
    }

    @Test
    public void append() {
        test.data = "test1" ;
        add.data = "test2";
        test.insert(add);
        tester.data = "test3";

        test.append(tester);

        System.out.println("append test with 'test2'");
        assertEquals("test3", test.last().get());
    }

    @Test
    public void insert() {
        tester.data = "test1";
        test.data = "fail";

        test.insert(tester);

        System.out.println("Insert 'test1' into test");

        String result = tester.last().get();
        assertEquals(test.data, result);
    }
}