/*Resizable-array implementation of the List interface.
Implements all optional list operations, and permits all elements,
 including null. In addition to implementing the List interface, 
 this class provides methods to manipulate the size of the array 
 that is used internally to store the list.*/

package session5_assignment2;
import java.util.ArrayList;
public class VariableStack implements Stack {
	int size;
	int index;
	ArrayList<Integer> list= new ArrayList<Integer>(size);
	
	
	VariableStack(int size) {
		this.size=size;
		index=-1;
	}

	@Override
	public void push(int i) {
		list.add(i);
		index++;
		
	}

	@Override
	public int pop() {
		return list.get(index--);
	}
	
	//returns string, use to print the details as string 
	public String toString() {
		return "VariableStack [size=" + list.size() + ", list=" + list + "]";
	}

}