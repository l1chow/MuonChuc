package session3;

import java.util.Scanner;

public class Stack {
    private int top;
    private int[] arr;

    public Stack(int capacity) {
        top = -1;
        arr = new int[capacity];
    }

    public boolean isEmpty() {
        return top < 0;
    }
    
    public boolean isFull() {
        return arr.length == (top + 1);
    }
    
    public void push(int data) {
        if(isFull()){
            throw new RuntimeException("Stack is full!");
        }
        top++;
        arr[top] = data;
    }
    
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty!");
        }
        int result = arr[top];
        top--;
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input stack's capacity: ");
        int n = sc.nextInt();
        Stack s = new Stack(n);
        
        for (int i = 0; i < n; i++) {
            System.out.print("Input number to push onto the stack: ");
            int x = sc.nextInt();
            s.push(x);
        }
        
        System.out.println("Stack is empty: " + s.isEmpty());
        System.out.println("Stack is full: " + s.isFull());
        
        for (int i = 0; i < n; i++) {
            System.out.print(s.pop() + " ");
        }
    }
}
