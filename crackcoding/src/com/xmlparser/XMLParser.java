package com.xmlparser;

import com.ds.LLStack;

public class XMLParser {
	public void Parse(String xml){
		LLStack<Character> S = new LLStack<Character>();
		String output = new String();
		for(int i = 0; i < xml.length() ; i++){
			char currentChar = xml.charAt(i);
			if(currentChar == '<')
				if(S.top() == '>')
				S.Push(currentChar);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
