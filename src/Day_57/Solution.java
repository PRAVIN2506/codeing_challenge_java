package Day_57;


public class Solution {
    public static void main(String[] args) {
        MyCircularDeque deque = new MyCircularDeque(3); // size 3

        System.out.println(deque.insertLast(1));  // returns true
        System.out.println(deque.insertLast(2));  // returns true
        System.out.println(deque.insertFront(3)); // returns true
        System.out.println(deque.insertFront(4)); // returns false, queue is full
        System.out.println(deque.getRear());      // returns 2
        System.out.println(deque.isFull());       // returns true
        System.out.println(deque.deleteLast());   // returns true
        System.out.println(deque.insertFront(4)); // returns true
        System.out.println(deque.getFront());     // returns 4
    }
}


class Node
{
    public int val;
    public Node prev;
    public Node next;
    public Node(int val)
    {
        this.val = val;
        prev = null;
        next = null;
    }
}

class MyCircularDeque {
    Node head = new Node(-1);
    Node tail = new Node(-1);
    int size;
    int currSize;

    public MyCircularDeque(int k) {
        head.next = tail;
        tail.prev = head
        ;
        size = k;
        currSize = 0;
    }

    public boolean insertFront(int value) {
        if(currSize==size)
            return false;
        addNode(head, value);
        currSize++;
        return true;
    }

    public boolean insertLast(int value) {
        if(currSize==size)
            return false;
        addNode(tail.prev, value);
        currSize++;
        return true;
    }

    public boolean deleteFront() {
        if(currSize==0)
            return false;
        deleteNode(head.next);
        currSize--;
        return true;
    }

    public boolean deleteLast() {
        if(currSize==0)
            return false;
        deleteNode(tail.prev);
        currSize--;
        return true;
    }

    public int getFront() {
        if(currSize==0)
            return -1;
        return head.next.val;
    }

    public int getRear() {
        if(currSize==0)
            return -1;
        return tail.prev.val;
    }

    public boolean isEmpty() {
        return currSize==0;
    }

    public boolean isFull() {
        return currSize==size;
    }

    public void addNode(Node head, int value)
    {
        Node after = head.next;
        Node temp = new Node(value);
        head.next = temp;
        temp.prev = head;
        temp.next = after;
        after.prev = temp;
    }

    public void deleteNode(Node head)
    {
        Node after = head.next;
        Node before = head.prev;
        before.next = after;
        after.prev = before;
    }

}

