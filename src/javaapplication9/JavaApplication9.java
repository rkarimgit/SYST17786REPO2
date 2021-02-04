/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author r2kar
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee[] obj = new Employee[2] ;
 
     //create & initialize actual employee objects using constructor
     obj[0] = new Employee(123456,"George");
     obj[1] = new Employee(340091,"Nancy");
 
     //display the employee object data
     System.out.println("Employee Object 1:");
     obj[0].showData();
     System.out.println("Employee Object 2:");
     obj[1].showData();
  }
}
//Employee class with empId and name as attributes
class Employee{
  int theEmpId;
  String theName;
  //Employee class constructor
  Employee(int empID, String name){
     theEmpId = empID;
     theName = name;
  }
public void showData(){
   System.out.print("EmpId = "+theEmpId + "  " + " Employee Name = "+theName);
   System.out.println();
   System.out.println("THANK YOU");
 }
    
    
}
