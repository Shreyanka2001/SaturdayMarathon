package com.kodnest.training.infiniteLoops;

public class infiniteLoops {
	public static void main(String[] args) {
		int i=1;
		for(;;)
		{
			
				if(i!=100000)
				{
					System.out.println(i);
				}
				if(i==200000) {
					break;
					//return;
					//System.exit(0);
				}
				i++;
			
		}
	}

}
