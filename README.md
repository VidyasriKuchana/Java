# Java Employee Creation 
It is a program with a business logic and a real entity.

In Business logic we have given the properties like name, age, salary and designation of employee.

In user logic i.e., in main class, we created an object of business logic.

using scanner class, we are going to take the choice of the user.

once the user made a choice, it acts accordingly.. 

Like; if choice is 1: create , 2: display, 3: Raise salary ,4. Exit.

The programs executes continuously util and unless the user enters 4 as their choice.

In business logic, we take the properties as :

             String name;
             int age;
             double salary;
             String job;
             
 And the behaviours as create(), display(), raiseSalary() as follows :
 
 For creating the employee we should first have a scanner class variable, so add " import java.util.Scanner; "
 
 Create a Scanner variable with which we can initialize the properties of employee with the inputs given by user while execution time.
 
 This is done by :            Scanner scan = new Scanner(System.in);
 
 create method is now defined as follows : 
 
 
              void create()
              {
	                   System.out.println("Enter name : ");
	                       this.name=sc.next();
	                   System.out.println(" Enter Age : ");
	                       this.age=sc.nextInt();
	                   System.out.println(" Enter Salary : ");
	                       this.salary = sc.nextDouble();
	                   System.out.println(" Enter Designation ");
	                       this.job= sc.next();
             }
              
display method is designed to display the details of employee created. That is done as follows :

		void display()
		{
	    		System.out.println("Name : "+this.name+" \n Age : "+this.age+" \n Salary : "+this.salary+" \n Designation : "+this.job);
		}

The Raise salary method is designed in business logic in order to raise the employee's salary by 1000, it also displays that the salary raised by 1000.

The syntax for this method is as follows :


		void raiseSalary()
		  {
		  	 this.salary=salary+1000;
		  	 System.out.println(" Salary Raised by 1000.0");
      	    }
