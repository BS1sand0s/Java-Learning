package ClassReImplement;

public class DeepCopy2 {

	public static void main(String[] args) {
	  int a[]={1,2,3,4};
	  int b[] = new int[a.length];
	  
	  for(int i=0;i<a.length;i++){
		  b[i] = a[i];
	  }
	  
	  b[0]++; 
	  for(int i=0;i<a.length;i++){
		  System.out.print(a[i]+" ");
	  }
	  for(int i=0;i<b.length;i++){
		  System.out.print(b[i]+" ");
	  }
	  

	}

}
