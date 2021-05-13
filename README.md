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
 
 
