package wt.model;

import java.util.Stack;

public class BalancedParanthesisModel {
	public String out1="";
	public String out2="";
	public String BalancedParanthesis(String str) {
		Stack<Character> stack = new Stack<>();
		String result="";
		char[] s1=str.toCharArray();
		for(char ch:s1)
		{
            if(ch=='(' || ch=='[' || ch=='{')
                stack.push(ch);
            else if(ch==']')
            {
                if(!stack.empty() &&stack.peek()=='[')
                    stack.pop();
                else
                    stack.push(ch);
            }
            else if(ch==')')
            {
                if(!stack.empty() &&stack.peek()=='(')
                    stack.pop();
                else
                    stack.push(ch);
            }
            else if(ch=='}')
            {
                if(!stack.empty() &&stack.peek()=='{')
                    stack.pop();
                else
                    stack.push(ch);
            }
		}

        if(stack.empty())
		{
        	result="Balanced";
            System.out.println("Balanced");
            return result;
			
		}
        result="Unbalanced";
        System.out.println("Unbalanced");
		    
		return result;
	}
	public BalancedParanthesisModel(String s) {
		this.out1=s;
		this.out2=(this.BalancedParanthesis(this.out1)).toString();
	}
}
