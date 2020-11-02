/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;


public class Stack {
    public int stck[] = new int[10];
    public int tos,temptos;
    // Initialize top-of-stack
    Stack() {
        tos = -1;
        temptos=9;
    }
    // Push an item onto the stack
    void push(int item) {
        if(tos==9)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }
        
        // Pop an item from the stack
    int pop() {
        if(tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
    /*int show() {
        if(temptos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stck[temptos--];
    }*/
}
