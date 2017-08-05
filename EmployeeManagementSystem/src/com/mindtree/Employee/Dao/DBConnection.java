/**
 * 
 */
package com.mindtree.Employee.Dao;

/**
 * @author M1041940
 *
 */
import java.sql.*;
import com.mindtree.Employee.*;
import com.mysql.jdbc.Statement;
public class DBConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Welcome123");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
