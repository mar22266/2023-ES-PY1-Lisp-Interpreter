import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class V_StackTest {

    @Test
    void push() {
        V_Stack<String> stack = new V_Stack<String>();
        stack.push("a");
        assertEquals(true, stack.isInStack("a"));
    }

    @Test
    void isInStack() {
        V_Stack<String> stack = new V_Stack<String>();
        stack.push("a");
        assertEquals(true, stack.isInStack("a"));
    }

    @Test
    void pop() {
        V_Stack<String> stack = new V_Stack<String>();
        stack.push("a");
        assertEquals("a", stack.pop());

    }

    @Test
    void peek() {
        V_Stack<String> stack = new V_Stack<String>();
        stack.push("a");
        assertEquals("a", stack.peek());
    }

    @Test
    void isEmpty() {
        V_Stack<String> stack = new V_Stack<String>();
        assertEquals(true, stack.isEmpty());
    }

    @Test
    void remove() {
        V_Stack<String> stack = new V_Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.remove("b");
        assertEquals(false, stack.isInStack("b"));
    }

    @Test
    void removeFirst() {
        V_Stack<String> stack = new V_Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.removeFirst();
        assertEquals(false, stack.isInStack("a"));
    }

    @Test
    void size() {
        V_Stack<String> stack = new V_Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        assertEquals(3, stack.size());
    }

    @Test
    void clear() {
        V_Stack<String> stack = new V_Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.clear();
        assertEquals(0, stack.size());
    }

    @Test
    void get() {
        V_Stack<String> stack = new V_Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        assertEquals("a", stack.get(0));
    }
}