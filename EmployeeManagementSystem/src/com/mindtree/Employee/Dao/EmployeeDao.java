/**
 * 
 */
package com.mindtree.Employee.Dao;

import java.sql.SQLException;
import java.util.ArrayList;



/**
 * @author M1041940
 *
 */
import com.mindtree.Employee.entity.*;
public interface EmployeeDao
{

	public void insertEmployeeDetails() throws SQLException;
	public void searchEmployee(int id)throws SQLException;
	public void showAllEmployees() throws SQLException;
	public void deleteEmployee(int id) throws SQLException;
}
