package com.Generator;
import java.util.Random;

public class Credentials {
	public String generateEmailID(String fname,String sname,String dept) {
		return fname+sname+"@"+dept+".TCS.com";
	}
	
	public String generatePassword() {
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialChar="!@#$%^&*<>?";
		String v=capitalLetters+smallLetters+numbers+specialChar; 
	
		Random r= new Random();
		
		char p[]=new char[8];
		
		for(int i=0;i<8;i++) {
			p[i]=v.charAt(r.nextInt(v.length()));
		}
		return new String(p);
		
		
	}
	
	public void displayEmpDetails(String fname,String sname,String generateEmail,String genPwd) {
		System.out.println("Employee first name is: "+fname);
		System.out.println("Employee last name is: "+sname);
		System.out.println("Employee Email ID is: "+generateEmail);
		System.out.println("Employee password is: "+genPwd);
	}
	
	
	
	

}
