package ClassBin;

class Employees{
	  int empId;
	  String name;
	  Employees(int id, String n){
	     empId = id;
	     name = n;
	  }
	public void showData(){
	   System.out.println("EmpId = "+empId + "  " + " Employee Name = "+name);
	   System.out.println();
	 }
	}
public class Employee{
	
	public static void main(String args[]){
		    Employees emp[] = new Employees[2] ;
		 
		     emp[0] = new Employees(100,"ABC");
		     emp[1] = new Employees(201,"XYZ");
		 
		     for(int i=0;i<emp.length;i++) {
		     //System.out.println(i+1 +"Employee :");
		     if(emp[i].empId%2==0)
		     emp[i].showData();
		  }
		}
		
	}


