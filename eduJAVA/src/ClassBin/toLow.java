package ClassBin;

public class toLow {
	public static void main(String args[]){
		String st= "JaVa";
		char str[]=st.toCharArray();
		for(int i=0;i<str.length;i++)
		{
    		if(str[i]>='A' && str[i]<='Z')
    		{ 
    			str[i]=(char)((int)str[i]+32);
    		}
		}
		System.out.println("The string in LowerCase is");
		for(int i=0;i<str.length;i++)
			System.out.print(str[i]);
	}
}
