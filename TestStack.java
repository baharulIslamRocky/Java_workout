/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author ROCKEY-RAEM
 */
public class TestStack {
    
    public static void main(String args[]) {
            Stack mystack1 = new Stack();
            Stack mystack2 = new Stack();
            // push some numbers onto the stack
            for(int i=0; i<10; i++) mystack1.push(i);
            //for(int i=10; i<20; i++) mystack2.push(i);
            // pop those numbers off the stack
            
            System.out.println("Stack in mystack1:");
            for(int i=9; i>=0; i--)
            {
                System.out.println(mystack1.stck[i]);
            }
            
            for(int i=0; i<10; i++)
            {
                mystack2.push(mystack1.pop());
            }
            System.out.println("Stack in mystack2:");
            for(int j=0; j<10; j++)
                System.out.println(mystack2.pop());
            // these statements are not legal
            // mystack1.tos = -2;
            // mystack2.stck[3] = 100;
            }
    
}
