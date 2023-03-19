import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A_StackTest {

    @Test
    void push() {
        A_Stack<String> stack = new A_Stack<String>();
        stack.push("a");
        assertEquals(true, stack.isInStack("a"));
    }

    @Test
    void pop() {
        A_Stack<String> stack = new A_Stack<String>();
        stack.push("a");
        assertEquals("a", stack.pop());
    }

    @Test
    void peek() {
        A_Stack<String> stack = new A_Stack<String>();
        stack.push("a");
        assertEquals("a", stack.peek());
    }

    @Test
    void isEmpty() {
        A_Stack<String> stack = new A_Stack<String>();
        assertEquals(true, stack.isEmpty());
    }

    @Test
    void remove() {
        A_Stack<String> stack = new A_Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.remove("b");
        assertEquals(false, stack.isInStack("b"));
    }

    @Test
    void removeFirst() {
        A_Stack<String> stack = new A_Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.removeFirst();
        assertEquals(false, stack.isInStack("a"));
    }

    @Test
    void size() {
        A_Stack<String> stack = new A_Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        assertEquals(3, stack.size());

    }

    @Test
    void clear() {
        A_Stack<String> stack = new A_Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.clear();
        assertEquals(true, stack.isEmpty());
    }

    @Test
    void get() {
        A_Stack<String> stack = new A_Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        assertEquals("b", stack.get(1));
    }
}