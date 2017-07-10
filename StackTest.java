package exercise;

import static org.junit.Assert.*;
import java.util.EmptyStackException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class StackTest {
	
	@Test
	public void isEmpty(){
		Stack s = new Stack();
		s.push(3);
		s.push(7);
		s.pop();
		s.pop();
		boolean e = s.empty();
		assertTrue(e);
	}
	
	@Test
	public void isNotEmpty(){
		Stack s = new Stack();
		s.push(3);
		s.push(7);
		s.pop();
		boolean e = s.empty();
		assertFalse(e);
	}

	@Test
	public void peek(){
		Stack s = new Stack();
		s.push(2);
		s.push(1);
		assertEquals(1, s.peek());
	}
	
	@Test(expected = EmptyStackException.class)
	public void peek2(){
		Stack s = new Stack();
		s.peek();
		
	}
	
	@Test
	public void pop(){
		Stack s = new Stack();
		s.push(2);
		s.push(1);
		assertEquals(1, s.pop());
		assertEquals(2, s.pop());
	}
	
	@Test(expected = EmptyStackException.class)
	public void pop2(){
		Stack s = new Stack();
		s.pop();
	}
	
	@Test(expected = FullStackException.class)
	public void full(){
		Stack s = new Stack();
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		s.push(9);
		s.push(10);
		s.push(11);
		s.push(12);
		s.push(13);
		s.push(14);
		s.push(15);
		s.push(16);
		s.push(17);
		s.push(18);
		s.push(19);
		s.push(20);
	}
	
}
