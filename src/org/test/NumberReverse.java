package org.test;

public class NumberReverse {
	public static void main(String [] args) {
		//int num=141;
		//int temp=num;//141
		//int rev=0;
		//while(num>0) {//1 141//2 14
	//	int n=num%10;//1   //
	//	rev=(rev*10)+n;//1
	//	num=num/10;//14
		
		
	int num=21407;
	int i=0, j=0;
	while(num>0) {
		 int n=num%10;
		j=(j*10) +n;
		num = num/10;
		
	}		
System.out.println(j);


	
	
	
		}
		
	
	


	}


