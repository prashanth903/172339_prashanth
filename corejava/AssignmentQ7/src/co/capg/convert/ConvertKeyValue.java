package co.capg.convert;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConvertKeyValue {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"Mirza\n");
		map.put(2,"sai\n");
		map.put(3,"rishi\n");
		
		StringBuilder sb=new StringBuilder();
		map.forEach((key,value)->sb.append(key + value));
		System.out.println(sb.toString());
	
	/*Set<Entry<Integer,String>> entrySet=map.entrySet();
	for(Entry<Integer,String> entry :entrySet) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}*/
	}

}
