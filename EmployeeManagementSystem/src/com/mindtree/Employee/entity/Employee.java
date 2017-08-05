/**
 * 
 */
package com.mindtree.Employee.entity;

/**
 * @author M1041940
 *
 */
import java.util.*;
public class Employee  {

	/**
	 * @param args
	 */
	private int id;
	private String name=null;
	private String address=null;
	
	Scanner sc=new Scanner(System.in);
	public int getId() {
		return id;
	}


	public void setId(int id) {
		//System.out.println("Enter the id");
		//id=sc.nextInt();
		this.id = id;
	}


	public String getName() {
		
		return name;
	}


	public void setName(String name) {
		//System.out.println("Enter the Employee Name");
		//name=sc.nextLine();
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		//System.out.println("Enter the Employee Address");
		//address=sc.nextLine();
		this.address = address;
	}
}