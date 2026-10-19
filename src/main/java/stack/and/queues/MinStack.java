package stack.and.queues;

import java.util.Stack;

public class MinStack {

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-1);
        obj.push(1);
        obj.push(-3);
        obj.push(2);
        obj.push(3);
        obj.pop();
        System.out.println("Top: " + obj.top());
        System.out.println("Minimum: " + obj.getMin());
    }

    private Stack<Integer> stack;
    private Stack<Integer> stackMin;
    public MinStack() {
        stack = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);
        if(stackMin.isEmpty() || value <= stackMin.peek()) {
            stackMin.push(value);
        }
    }

    public void pop() {
        int val = stack.pop();
        if(stackMin.peek() == val) {
            stackMin.pop();
        }

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stackMin.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 *
 * Constraints:
 * -2(power)31 <= val <= 2(power)31 - 1
 * Methods pop, top and getMin operations will always be called on non-empty stacks.
 * At most 3 * 104 calls will be made to push, pop, top, and getMin.
 */