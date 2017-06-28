/*fixed size array implementation*/

package session5_assignment2;

import java.util.Arrays;
public class FixedStack implements Stack {
	int size;
	int index;
	int stack[];
	
	//constructor use to define the size of stack
	FixedStack(int size){
		this.size=size;
		index=-1;
		stack= new int[size];
	}
	
	//overrides the methods of interface Stack
	@Override
	public void push(int i) {
		if (index>=size-1)
			System.out.println("StackOverflow");
		else
			stack[++index]=i;		
	}
	@Override
	public int pop() {
		
		return stack[index--];
	}
	
	//returns string, use to print the details as string
	public String toString() {
		return "FixedStack [size=" + stack.length + ", index=" + index + ", stack=" + Arrays.toString(stack) + "]";
	}

}