package leetcode;

import static org.junit.Assert.*;
import leetcode.P2_AddTwoNumbers.ListNode;

import org.junit.Test;

public class P2_AddTwoNumbersTest {

	@Test
	public void test1() {
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

		ListNode n7 = o.new ListNode(7);
		ListNode n8 = o.new ListNode(0);
		ListNode n9 = o.new ListNode(8);
		n7.next = n8;
		n8.next = n9;

		ListNode l1 = n1;
		ListNode l2 = n4;
		ListNode expect = n7;

		ListNode result = o.addTwoNumbers(l1, l2);

		ListNode current = result;
		while (current.next != null) {
			System.out.print(current.val + "->");
			current = current.next;
		}
		System.out.println(current.val);
		
		while(expect!=null && result != null) {
			assertEquals(expect.val, result.val);
			expect = expect.next;
			result = result.next;
		}
		assertNull(expect);
		assertNull(result);		
	}
	
	@Test
	public void test2() {
		P2_AddTwoNumbers o = new P2_AddTwoNumbers();

		ListNode n1 = o.new ListNode(5);

		ListNode n2 = o.new ListNode(5);

		ListNode n3 = o.new ListNode(0);
		ListNode n4 = o.new ListNode(1);
		n3.next = n4;

		ListNode l1 = n1;
		ListNode l2 = n2;
		ListNode expect = n3;

		ListNode result = o.addTwoNumbers(l1, l2);

		ListNode current = result;
		while (current.next != null) {
			System.out.print(current.val + "->");
			current = current.next;
		}
		System.out.println(current.val);
		
		while(expect!=null && result != null) {
			assertEquals(expect.val, result.val);
			expect = expect.next;
			result = result.next;
		}
		assertNull(expect);
		assertNull(result);		
	}

}
