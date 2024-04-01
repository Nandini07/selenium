package selpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class streampractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String nan="iamlikith";
	System.out.println(Arrays.asList(nan));
	
	nan.chars().distinct().forEach(s->System.out.print((char)s));
	
	//ArrayList<String> ar= new ArrayList<String>();
	
	//ar.add("nn");
	//ar.add("jj");
	//System.out.println(ar);
	
	//List- arraylist,linkedlist,vector
	//set- hashset,linkedhashset, treeset
	
	//map-hashmap,treemap,linkedhashmap
	HashSet<String> hs = new HashSet<String>();
	hs.add("USA");
	hs.add("UK");
	System.out.println(hs.size());
	java.util.Iterator<String> i =hs.iterator() ;
	
	System.out.println(i.next());
	HashMap<String,Integer> hm= new HashMap<String,Integer>();
	hm.put("hello", 0);
	hm.put("hr", 1);
	System.out.println(hm.get("hr"));
	
	System.out.println(hm);
	
	String name = "iamnandini";
	
	//HashMap<String,Integer> hashname= new HashMap<String,Integer>();
	//hashname.put(name.charAt(0), count());
	
}
}