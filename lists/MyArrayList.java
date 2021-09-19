package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class MyArrayList {

	

	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		List<String> fruits= new LinkedList<>();
		List<String>vegetables=new ArrayList<>();
		
		 fruits.add("Apple");
		 fruits.add("orange");
		  
		 vegetables.add("potato");
		 vegetables.add("tomato");
		 vegetables.add("brinjal");
		 vegetables.add("pumpkin");
		 String temp[] =new String[fruits.size()];
		 
		fruits.toArray(temp);
		for(String e:fruits){
			System.out.println(e);
		}
		 
		 
		
		
	}

}
