

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
for(int i=0; ;i++ ) {
		// 1. Get 2 numbers from the user and convert them to integer.
		String num = JOptionPane.showInputDialog("Give me a number");
		String num2 = JOptionPane.showInputDialog("Give me another number?");
		int x=Integer.parseInt(num);
		int y=Integer.parseInt(num2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Do you want to add, subtract, multiply, or divide", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "mulyiply", "divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if(operation==0){add(x,y);}
if(operation==1){sub(x,y);}
if(operation==2){mult(x,y);}
if(operation==3){div(x,y);}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}
	}
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(int n1, int n2) {
		JOptionPane.showMessageDialog(null, n1 + "+" + n2 + "=" + (n1+n2));
		
	}
	// 4. Create similar methods for subtraction, multiplication and division.
	static void sub(int n1, int n2) {
		JOptionPane.showMessageDialog(null, n1 + "-" + n2 + "=" + (n1-n2));
		
	}
	static void mult(int n1, int n2) {
		JOptionPane.showMessageDialog(null, n1 + "*" + n2 + "=" + (n1*n2));
		
	}
	static void div(int n1, int n2) {
		JOptionPane.showMessageDialog(null, n1 + "/" + n2 + "=" + (n1/n2));
		
	}



}