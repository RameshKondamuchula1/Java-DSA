package stack.and.queues;

import java.util.Stack;

public class MinQueue {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public static void main(String[] args) {
        MinQueue obj = new MinQueue();
        obj.push(-1);
        obj.push(1);
        obj.push(-3);
        obj.push(2);
        obj.push(3);
        obj.printStack();
        System.out.println("Peek: " + obj.peek());
    }

    public void printStack() {
        System.out.println(inputStack);
    }

    public MinQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    // Push element x to the back of queue
    public void push(int x) {
        inputStack.push(x);
    }

    // Removes the element from in front of queue and returns it
    public int pop() {
        shiftStacks();
        return outputStack.pop();
    }

    // Get the front element
    public int peek() {
        shiftStacks();
        return outputStack.peek();
    }

    // Returns whether the queue is empty
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }

    // Helper method to shift elements from inputStack to outputStack when needed
    private void shiftStacks() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
    }



    /*private Queue<Integer> queue;
    public MinQueue() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        return queue.poll();
    }

    public int peek() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }*/
}

/**
 * https://leetcode.com/problems/implement-queue-using-stacks/
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 *
 * Constraints:
 * 1 <= x <= 9
 * At most 100 calls will be made to push, pop, peek, and empty.
 * All the calls to pop and peek are valid.
 */