/**
 * 
 */
package com.mindtree.Employee.Dao;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;





import java.util.Scanner;

/**
 * @author M1041940
 *
 */
import com.mindtree.Employee.Dao.*;
import com.mindtree.Employee.entity.Employee;
//import com.mysql.jdbc.Statement;

import java.sql.*;
public class EmployeeDaoImpl implements EmployeeDao 
{
	/**
	 * @param args
	 */
	static int id=1;
	Connection con=null;
	Scanner sc=new Scanner(System.in);
	@Override
	public void insertEmployeeDetails() throws SQLException
	{
		Employee em=new Employee();
		em.setId(id++);
		System.out.println("Enter the name of the employee");
		String name=sc.nextLine();
		em.setName(name);
		System.out.println("Enter the address");
		String addr=sc.nextLine();
		em.setAddress(addr);
		// TODO Auto-generated method stub
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Welcome123");
		PreparedStatement updateemp = con.prepareStatement(
		         "insert into Employee_info values(?,?,?)");

		updateemp.setInt(1,em.getId());
	    updateemp.setString(2,em.getName());
	    updateemp.setString(3,em.getAddress());
	    updateemp.executeUpdate();
		//return false;
	}

	@Override
	public void searchEmployee(int id1)throws SQLException {
		// TODO Auto-generated method stub
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Welcome123");
	    Statement stmt=con.createStatement();
	    ResultSet rs=stmt.executeQuery("select * from Employee_info where id="+id1);
	    System.out.println("Id\tName\t\tAddress");
	    while (rs.next()) 
	      {
	         int id = rs.getInt("id");
	         String name = rs.getString("name");
	         String address = rs.getString("address");
	         System.out.println(id + "\t" + name+"\t\t"+address);
	      }  
		//return (Employee) rs;
	}

	@Override
	public void showAllEmployees() throws SQLException {
		// TODO Auto-generated method stub
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Welcome123");
	    Statement stmt=con.createStatement();
	    ResultSet rs=stmt.executeQuery("select * from Employee_info");
	      System.out.println("Id Name    Address");
	      
	      while (rs.next()) 
	      {
	         int id = rs.getInt("id");
	         String name = rs.getString("name");
	         String address = rs.getString("address");
	         System.out.println(id + "  " + name+"   "+address);
	      }     
		
		//return null;
	}

	@Override
	public void deleteEmployee(int id) throws SQLException {
		// TODO Auto-generated method stub
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Welcome123");
		PreparedStatement updateemp = con.prepareStatement(
		         "delete from employee_info where id=?");
		updateemp.setInt(1,id);
	    updateemp.executeUpdate();
		//return true;
	}
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EmployeeDaoImpl emp=new EmployeeDaoImpl();
		int ch = 0;
		do{

			System.out.println("Enter your choice for EmployeeManagement");
			System.out.println("1-Insert\n2-Search\n3-show\n4-delete\n5-exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					emp.insertEmployeeDetails();
					break;
				case 2:
					//Employee ob=new Employee();
					System.out.println("Enter the id u want to search");
					int id=sc.nextInt();
					emp.searchEmployee(id);
					//System.out.println(ob.getId() + "  "+ob.getName()+"   "+ob.getAddress());
					break;
				case 3:
					emp.showAllEmployees();
					break;
				case 4:
					System.out.println("Enter the id u want to delete");
					int id1=sc.nextInt();
					emp.deleteEmployee(id1);
					/*if(ans==true)
						System.out.println("deleted");
					else
						System.out.println("cannot deleted");*/
					break;
				default:
					System.out.println("Wrong choice entered");
			}
			System.out.println("Do u want to continue enter 6 otherwise 5");
			ch=sc.nextInt();
		}while(ch!=5);
		System.exit(0);
	}
}
