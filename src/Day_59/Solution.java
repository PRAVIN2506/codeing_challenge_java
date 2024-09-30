package Day_59;

public class Solution {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(3); // Stack of max size 3

        customStack.push(1);
        customStack.push(2);
        System.out.println(customStack.pop()); // returns 2
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.increment(5, 100); // increment all elements by 100
        customStack.increment(2, 100); // increment first two elements by 100
        System.out.println(customStack.pop()); // returns 103
        System.out.println(customStack.pop()); // returns 202
        System.out.println(customStack.pop()); // returns 201
        System.out.println(customStack.pop()); // returns -1 (stack is empty)
    }
}


class CustomStack {
    int [] stack;
    int top = -1;

    public CustomStack(int maxSize) {
        this.stack = new int [maxSize];
    }

    public void push(int x) {
        if (top < this.stack.length - 1) {
            top ++;
            this.stack[top] = x;
        }
    }

    public int pop() {
        if (top != -1) {
            return this.stack[top --];
        }
        return -1;
    }

    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k, top + 1); i ++) {
            this.stack[i] += val;
        }
    }
}


