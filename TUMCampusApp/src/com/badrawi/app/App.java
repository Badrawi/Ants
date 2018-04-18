package com.badrawi.app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String antLine = "";
		 if(args != null && !args[0].isEmpty())
		 {
			 antLine = args[0];
		 }
		 else
    	{
    		Scanner sc = new Scanner(System.in);
    		antLine = sc.nextLine();
    	}
    	int count = 0;
    	for(int i = 0 ; i < antLine.length() ; i++)
    	{
    		if(antLine.charAt(i) != '.')
    		{
    			if(antLine.charAt(i) == 'a' && antLine.charAt(i+1) == 'n' && antLine.charAt(i+2) == 't')
    			{
    				i+= 2;
    			}
    			else 
    			{
    				count++;
    				if((antLine.charAt(i) == 'a' && (antLine.charAt(i+1) == 'n' || antLine.charAt(i+2) == 't')))
    				{
    					i+=2;
    				}
    				else if(antLine.charAt(i+1) == 't')
    				{
    					i++;
    				}
    			}
    		}
    	}
    	
    	System.out.println(count);

	}

}
