package Practice;

public class RomanNeum {
	class Solution {
	    // Finds decimal value of a given roman numeral
	    public int romanToDecimal(String str) {
	        String[] R=str.split("");
	        int val=0;
	        int nei=1;
	        for(int i=R.length-1;i>=0;i--){
	            switch (R[i]){
	                case "I":
	                case"i":
	                    val+=1;
	                    if(nei>1)val-=2;
	                    nei=1;
	                    break;
	                case "V":
	                case"v":
	                    val+=5;
	                    nei=5;
	                    break;
	                case "X":
	                case"x":
	                    val+=10;
	                    if(nei>10)val-=20;
	                    nei=10;
	                    break;
	                case "L":
	                case"l":
	                    val+=50;
	                    nei=50;
	                    break;
	                case "C":
	                case"c":
	                    val+=100;
	                    if(nei>100)val-=200;
	                    nei=100;
	                    break;
	                case "D":
	                case"d":
	                    val+=500;
	                    nei=500;
	                    break;
	                case "M":
	                case"m":
	                    val+=1000;
	                    nei=1000;
	                    break;
	            }
	            
	        }
	    return val;
	        
	    }
	    
	}

}
