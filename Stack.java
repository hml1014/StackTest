package exercise;

import java.util.EmptyStackException;

public class Stack<E> {
	private E[] data;
	private int top = -1;
	private static final int default_capacity=20;
	
	public Stack()
	{
		data = (E[]) new Object[default_capacity];
	}
	
	public boolean empty()
	{
		return top ==-1;
	}
	
	public void push(E item)
	{
		if (top==default_capacity-1)
		{
			throw new FullStackException();
		}
		data[++top] = item;
	}
	
	public E pop()
	{
		if (empty())
		{
			throw new EmptyStackException();
		}
		return data[top--];
	}
	
	public E peek()
	{
		if (empty())
		{
			throw new EmptyStackException();
		}
		return data[top];
	}
	
}
