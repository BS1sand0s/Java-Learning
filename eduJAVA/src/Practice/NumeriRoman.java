package Practice;

public class NumeriRoman {
	class Solution
	{
		String convertToRoman(int n) {
		    	//code here
		    String ans="";
		    if(n/1000>=1){
		        ans+="M".repeat((int)Math.floor(n/1000));
		        n-=(Math.floor(n/1000))*1000;
		    }
		    if(n>=900 &&n<1000){
		        ans+="CM";
		        n-=900;
		    }
		    if(n>=500 && n<900){
		        ans+="D";
		        n-=500;
		    }
		    if(n>=400 &&n<500){
		        ans+="CD";
		        n-=400;
		    }
		    if(n>=100 && n<400){
		        ans+="C".repeat(((int)Math.floor(n/100)));
		        n-=100*(Math.floor(n/100));
		    }
		    if(n>=90 &&n<100){
		        ans+="XC";
		        n-=90;
		    }
		    if(n>=50&& n<90){
		        ans+="L";
		        n-=50;
		    }
		    if(n>=40 &&n<50){
		        ans+="XL";
		        n-=40;
		    }
		    if(n>=10 && n<40){
		        ans+="X".repeat((int)Math.floor(n/10));
		        n-=10*((int)Math.floor(n/10));
		    }
		    if(n>=9 &&n<10){
		        ans+="IX";
		        n-=9;
		    }
		    if(n>=5&& n<9){
		        ans+="V";
		        n-=5;
		    }
		    if(n>=4 &&n<5){
		        ans+="IV";
		        n-=4;
		    }
		    if(n>=1 && n<4){
		        ans+="I".repeat(n);
		        n-=n;
		    
		   
		}
		 return ans;
		}
	}

}
