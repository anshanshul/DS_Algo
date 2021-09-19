package maps;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Map;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<String,Integer>number=new HashMap<>();
//		number.put("one",1);
//		number.put("two",2);
//		number.put("five",5);
//		number.remove("two", 4);
//		
//		
//
//		System.out.println(number);
//		System.out.println(number.keySet());
//		System.out.println(number.values());
//		System.out.println(number.entrySet());
//		
//		Set<Entry<String,Integer>>entries=number.entrySet();
//		for(Entry<String,Integer>entry:number.entrySet()) {
//			entry.setValue(entry.getValue()*100);
//			
//		}
//		System.out.println(number);
		System.out.println(getHash(""));

	}
	public static int getHash(String s) {
		int hash=0;
		 for(int i=0;i<s.length();i++) {
			 hash+=s.charAt(i);
			 
		 }
		 return hash;
	}

}
