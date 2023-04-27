package ClassBin;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Lamda {
	public static List<Integer> getEvenList(List<Integer> list){
    	
	    // Collection ->stream() ->intermediate ->terminal
	    List<Integer> evenList =list.stream()
	    		               .filter(x->x%2==0)
	    		               .collect(Collectors.toList());
	    return evenList;
	      
	    }
		System.out.println("After Even process");
		for(Integer obj:getEvenList(list)){
			System.out.print(obj+" ");