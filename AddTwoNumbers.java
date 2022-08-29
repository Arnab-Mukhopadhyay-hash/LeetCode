package LeetCode;

import java.util.Scanner;
import java.util.ArrayList;

public class AddTwoNumbers {
    public static int ListSize(ListNode h){
        // UTILITY FUNCTION TO FIND THE SIZE OF THE LINKED LIST
        // NOT USED
        int s = 0;
        while(h.next != null){
            s++;
            h = h.next;
        }
        return s;
    }
    

    /* THE SOLUTION CLASS OF LEETCODE REST OF THE CODE IS FOR UTILITY */
    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode ans = new ListNode(0); // creating an answer list
            ListNode duplicat_ans = ans;    // creating a duplicate answer list for calculations
            int sum = 0, carry = 0;

            while(l1 != null || l2 != null){
                int n1 = l1 != null ? l1.data:0;    // checking for the number in node if node is null then we take the number as 0
                int n2 = l2 != null ? l2.data: 0;   // ....
                sum = n1 + n2 + carry;  // finding the sum of the integers
                if(sum >= 10) carry = 1;    // re-initializing the carry
                else carry = 0;
                ans.next = new ListNode(sum%10);    // last digit of sum is stored in node
                ans = ans.next; // move the pointer to the next node of answer list
                if(l1 != null)l1 = l1.next; // move the l1 pointer forwards if l1's current node is not null
                if(l2 != null)l2 = l2.next; // move the l2 pointer forwards if l2's current node is not null
            }

            if(carry > 0) ans.next = new ListNode(carry);
            return duplicat_ans.next;
        }
    }
    static class ListNode{
        // NODE CLASS FOR CREATION OF NODES.
        int data;
        ListNode next;
        // Constructor for node
        ListNode(int number){
            // this signifies the current object
            this.data = number;
            this.next = null;
        }
    }

    public static void addNode(ListNode H, int data){
        // UTILITY FUNCTION TO ADD NODES AT THE LAST OF THE LISTS.
        ListNode newNode = new ListNode(data);
        if(H == null){
            H = newNode;
        }
        else{
            while(H.next != null){
                H = H.next;
            }
            H.next = newNode;
        }
    }

    public static void display(ListNode H){
        // UTILITY FUNCTION TO DISPLAY THE LINKED LIST
        while(H != null){
            System.out.print(H.data + " ");
            H = H.next;
        }
        System.out.println();
    }

    /* DRIVER CODE */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Number of integers: ");
        int n = scan.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        System.out.println("Enter the first number in reverse order: ");
        for(int i = 0; i < n ;i++){
            a.add(scan.nextInt());
        }

        ListNode h1 = new ListNode(a.get(0));
        for(int i = 1; i < a.size(); i++){
            addNode(h1, a.get(i));
        }

        System.out.println("Enter the second number in reverse order: ");
        for(int i = 0; i < n ; i++){
            b.add(scan.nextInt());
        }

        ListNode h2 = new ListNode(b.get(0));
        for(int i = 1; i < b.size(); i++){
            addNode(h2, b.get(i));
        }

        Solution ans = new Solution();
        ListNode answer = ans.addTwoNumbers(h1, h2);

        display(answer);

    }
}
