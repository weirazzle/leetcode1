package leetcode;

public class P2_AddTwoNumbers {

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode last = new ListNode(0);
		int carry = 0;

		last.val = l1.val + l2.val;
		if (last.val >= 10) {
			last.val -= 10;
			carry = 1;
		}

		ListNode result = last;

		while ((l1.next != null) && (l2.next != null)) {
			l1 = l1.next;
			l2 = l2.next;
			ListNode n = new ListNode(0);
			
			n.val = l1.val + l2.val + carry;
			if (n.val >= 10) {
				n.val -= 10;
				carry = 1;
			}
			else
				carry = 0;

			last.next = n;
			last = last.next;

		}
		while (l1.next != null) {
			l1 = l1.next;
			ListNode n = new ListNode(0);
			
			n.val = l1.val + carry;
			if (n.val >= 10) {
				n.val -= 10;
				carry = 1;
			}
				
			else
				carry = 0;

			last.next = n;
			last = last.next;
		}
		while (l2.next != null) {
			l2 = l2.next;
			ListNode n = new ListNode(0);
			
			n.val = l2.val + carry;
			if (n.val >= 10) {
				n.val -= 10;
				carry = 1;
			}
			else
				carry = 0;

			last.next = n;
			last = last.next;
		}
		if (carry != 0) 
			last.next = new ListNode(1);;

		return result;
	}

	public static void main(String[] args) {

		P2_AddTwoNumbers o = new P2_AddTwoNumbers();

		ListNode n1 = o.new ListNode(2);
		ListNode n2 = o.new ListNode(4);
		ListNode n3 = o.new ListNode(3);
		n1.next = n2;
		n2.next = n3;

		ListNode n4 = o.new ListNode(5);
		ListNode n5 = o.new ListNode(6);
		ListNode n6 = o.new ListNode(4);
		n4.next = n5;
		n5.next = n6;

		// ListNode n7 = o.new ListNode(7);
		// ListNode n8 = o.new ListNode(0);
		// ListNode n9 = o.new ListNode(8);
		// n7.next = n8;
		// n8.next = n9;

		ListNode l1 = n1;
		ListNode l2 = n4;
		// ListNode result = n7;

		ListNode result = o.addTwoNumbers(l1, l2);

		
		ListNode current = result;
		while (current.next != null) {
			System.out.print(current.val + "->");
			current = current.next;
		}
		System.out.println(current.val);
	}

}
