package IUS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    ILinkedList<String> tester;
    LinkedList<String> test = new LinkedList<>();

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void next() {
    }

    @Test
    public void last() {
    }

    @Test
    public void after() {
    }

    @Test
    public void detach() {
    }

    @Test
    public void get() {

    }

    @Test
    public void set() {
    }

    @Test
    public void setNext() {
    }

    @Test
    public void append() {
        tester = "test1";
        test.insert(tester);
        tester = "test2";
        test.append(tester);
        System.out.println("append test with 'test2'");
        assertEquals(tester, test.next.value);
        tester = null;
        test = null;
    }

    @Test
    public void insert() {
        tester = "test1";
        test.insert(tester);
        System.out.println("Insert 'test1' into test");
        assertEquals(tester, test.value);
        tester = null;
        test = null;
    }
}