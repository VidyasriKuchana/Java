import java.util.Scanner;
class Emp{
    String name;
    int age;
    double salary;
    String job;
    Scanner sc= new Scanner(System.in);
	void create(){
	    System.out.println("Enter name : ");
	       this.name=sc.next();
	   System.out.println(" Enter Age : ");
	      this.age=sc.nextInt();
	   System.out.println(" Enter Salary : ");
	      this.salary = sc.nextDouble();
	   System.out.println(" Enter Designation ");
	     this.job= sc.next();
	}
	void display(){
	    System.out.println("Name : "+this.name+" \n Age : "+this.age+" \n Salary : "+this.salary+" \n Designation : "+this.job);
	}
	void raiseSalary(){
	   this.salary=salary+1000;
	   System.out.println(" Salary Raised by 1000.0");
                 }
}
class Main{
	public static void main(String[] args){
	Emp e= new Emp();
	while(true){
	      Scanner sc=new Scanner(System.in);
	      System.out.println("1.Create \n 2.Display \n 3.Raise Salary \n 4. Exit");
	      int i=sc.nextInt();
		if(i==4) break;
		switch(i){
			case 1 :     e.create();
                  			 break;
			case 2 :
				e.display();
				break;
			case 3:    e.raiseSalary();
				break;
	  	}
	}
         }
}

