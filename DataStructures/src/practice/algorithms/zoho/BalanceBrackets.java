package practice.algorithms.zoho;

class Stack<E> {
	E[] data;
	private int top=-1;
	private int size;

	Stack(int size) {
		this.size = size;
		this.data = (E[]) (new Object[10]);
	}

	public boolean isEmpty(){
		return this.top < 0 ? true : false ;
	}
	public void push(E value) {

		this.data[++top] = value;
		
	}

	public void pop() {
		if (top != -1) {
			this.data[top] = null;
			top--;
		}
	}

	public E peek() {
			return this.data[top];
		
	}

}

public class BalanceBrackets {
	static boolean output=true;

	public static void main(String[] args) {
		String expr = "((11)+(22))";
		System.out.println(evaluate(expr));
	}
	
	public static String evaluate(String expr){
		Stack<Character> exprStack = new Stack<Character>(expr.length());
		char nth=expr.charAt(expr.length()-1);
		if(nth=='(' ||nth=='{' ||nth=='[' )
			return "NO";
		for (int i = 0; i < expr.length(); i++) {
			char cur = expr.charAt(i);

			if (cur == '(' || cur == '[' || cur == '{')
				exprStack.push(cur);
			else if(exprStack.isEmpty())
			{
				return "NO";

			}
			else if (cur == ')' || cur == ']' || cur == '}') {
				if(cur==')' && exprStack.peek()!='('){
					return "NO";
				}else  if(cur==']' && exprStack.peek()!='['){
					return "NO";

				}else  if(cur=='}' && exprStack.peek()!='{'){
					return "NO";

				}
				else 
					exprStack.pop();

			}
			
		}
		
		return "YES";
		
	}
	

}
