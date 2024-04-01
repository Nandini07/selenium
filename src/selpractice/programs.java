package selpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.checkerframework.checker.units.qual.h;



public class programs {

	public static void main(String[] args) {
	
	        
		ArrayList<Integer> ar =new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.remove(0);
		System.out.println(ar);
		
		//System.out.println(ar.get(0));
		
		String name ="iamnandini into garden";
		
		//HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		//hm.put("c",h.class)
		
		//List<String> lis = Arrays.asList(name);
		//String newr = "";
		
		
		
		String[] lis= name.split(" ");
		System.out.println(lis.length);
		
        StringBuilder sb = new StringBuilder();

		for(int i =0;i<name.length();i++) {
			if(name.charAt(i)=='a') {
				sb.append('z');
				
			}
			else {
				sb.append(name.charAt(i));
			}
			
		}
		System.out.println(sb);
		
		for(int i=lis.length-1;i>=0;i--) {
			//System.out.print(lis[i]+ " ");
		}

		
		for(int i=name.length()-1;i>=0;i--) {
			//System.out.print(name.charAt(i));
		}
		String s1="nandini";
		String s2="Sai";
		System.out.println(s1+s2);	

		System.out.println((s1+s2).substring(s1.length(),(s1+s2).length()));
		System.out.println((s1+s2).substring(0,s1.length()));
		
		int a=0;
		int b=1;
		int c;
		System.out.println(a);	
		System.out.println(b);	
		for(int i=0;i<10;i++) {

			c=a+b;
			a=b;
			b=c;
			System.out.println(c);	

		}
		
		
		String str="nandu";
		//HashMap<>  hmp = new HashMap<>();
		char[] arr= str.toCharArray();
		int count=0;
		for(char i : arr ) {
			count++;
		}
		System.out.println(count);
		
		  int[] a3 = {4,3,6,7,8,9,10,11,12,13,10,11,12,13,14,6,12,13,14,15,16,17,18,19,20,21,22,23,4,5,6,7,8,9,10,11,12,13};
			int count1=0;
			int count2=0;
		    	for(int i=0;i<a3.length-1;i++) {
				    if(a3[i]==a3[i+1]-1){
				        count1++;
				    }else {
				        count1 = 0;
				    }
				    
				    if(count1>count2){
				        count2 = count1;
				    }

			}
		        System.out.println(count2+1);
		        
		     	}
	
	
	
}


