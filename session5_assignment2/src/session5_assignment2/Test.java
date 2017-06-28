package session5_assignment2;

public class Test {

	public static void main(String[] args) {
		/*creating object and performing push and pop operation on
		  fixedStack and VariableStack
		 */
		
		//FixedStack object with size 5 and index(0 to 4)
		FixedStack f = new FixedStack(5);	
		f.push(1);
		f.push(2);
		f.push(3);
		f.push(4);
		f.push(5);
		System.out.println(f);
		f.push(6);
		f.pop();
		f.pop();
		System.out.println(f);
		f.push(13);
		f.push(43);
		System.out.println(f);

		//VariableStack object with size 5 which gets increased
		VariableStack v = new VariableStack(5);
		v.push(1);
		v.push(2);
		v.push(3);
		v.push(4);
		v.push(5);
		System.out.println(v);
		v.push(6);
		System.out.println(v);
	}
}