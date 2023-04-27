package ClassBin;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Lamda {	public static List<Integer> getOddList(List<Integer> list){    		    // Collection ->stream() ->intermediate ->terminal	    List<Integer> oddList =list.stream()	    		               .filter(x->x%2==1)	    		               .collect(Collectors.toList());	    return oddList;	      	    }
	public static List<Integer> getEvenList(List<Integer> list){
    	
	    // Collection ->stream() ->intermediate ->terminal
	    List<Integer> evenList =list.stream()
	    		               .filter(x->x%2==0)
	    		               .collect(Collectors.toList());
	    return evenList;
	      
	    }	public static void main(String[] args) {		int[] arr = {21,22,23,24,25,26};		List<Integer> list = new ArrayList<>();		for(int item:arr){			list.add(item);		}				System.out.println("Before process");		System.out.println(list);        		System.out.println("After Odd process");		for(Integer obj:getOddList(list)){			System.out.print(obj+" ");		}
		System.out.println("After Even process");
		for(Integer obj:getEvenList(list)){
			System.out.print(obj+" ");	}	}}