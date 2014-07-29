package spoj;

import java.util.Scanner;
import java.util.Stack;

class ONP {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final int t = sc.nextInt();
		char[] in;
		Stack<Character> s;
		StringBuffer res;
		int len;
		for (int i = 0; i < t; i++) {
			in = sc.next().toCharArray();
			len = in.length;
			s = new Stack<Character>();
			res = new StringBuffer();

			for (int j = 0; j < len; j++) {
				if(in[j]=='(')
					continue;
				else if(in[j]==')'){
					res.append(s.pop());
				}else if(Character.isLetter(in[j])){
					res.append(in[j]);
				}else{
					s.push(in[j]);
				}
			}

			System.out.println(res);
		}
	}
}
