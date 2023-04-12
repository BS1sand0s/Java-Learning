package ClassBin;

import java.util.*;  
class MapTry{  
 public static void main(String args[]){  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Amit");  
  map.put(101,"Vijay");  
  map.put(102,"Rahul");  
  for(Map.Entry m:map.entrySet()){  
	  if(Integer.valueOf((int)m.getKey())== 100) {
  
	  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }
 }  
}  