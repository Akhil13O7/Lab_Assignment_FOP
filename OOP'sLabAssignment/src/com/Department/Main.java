package com.Department;

import java.util.Scanner;

import com.EmployeeName.Employee;
import com.Generator.Credentials;

public class Main {

	public static void main(String args[]) {
		Employee e=new Employee();
		
		Credentials c=new Credentials();
		String generateEmail = null;
		String genPwd = null;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please choose your department");
		System.out.println("1.Techanical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Support Staff");
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			generateEmail=c.generateEmailID(e.getFirstName().toLowerCase(),e.getLastName().toLowerCase(),"Technical");
			genPwd=c.generatePassword();
			break;
			
		case 2:
			generateEmail=c.generateEmailID(e.getFirstName().toLowerCase(),e.getLastName().toLowerCase(),"Admin");
			genPwd=c.generatePassword();
			break;
			
		case 3:
			generateEmail=c.generateEmailID(e.getFirstName().toLowerCase(),e.getLastName().toLowerCase(),"Human Resource");
			genPwd=c.generatePassword();
			break;
			
		case 4:
			generateEmail=c.generateEmailID(e.getFirstName().toLowerCase(),e.getLastName().toLowerCase(),"Support Staff");
			genPwd=c.generatePassword();
			break;
			
			default:
				System.out.println("Please enter valid choice");
			
		
		}
		c.displayEmpDetails(e.getFirstName(),e.getLastName(),generateEmail,genPwd);

	}

}
