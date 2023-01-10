package com.string.basic;

import java.util.HashSet;
import java.util.Set;

public class DuplicateRemovefromString {

	public static void main(String[] args) {
		//string repeate word are remove 
	
			String str = "NITIN";
			String[] arr = str.split("");
			// split() method splits a string into an array of substrings
			//arr={N,I,T,I,N};
			
			// why set there are no dulicate allow in set
			Set<String> st= new HashSet<String>();
			for(int i=0;i<arr.length; i++)
			{
				st.add(arr[i]);
			}
			for (String s:st)
			{
				System.out.print(s+" ");

			}
			System.out.println();
		 

	}

}
