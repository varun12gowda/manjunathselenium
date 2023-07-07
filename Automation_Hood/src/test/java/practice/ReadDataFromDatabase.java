package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class ReadDataFromDatabase {
	public static void main(String[] args) throws SQLException {
		// step1: create an instance of JDBC driver
		Driver dbDriver =new Driver();
		
		 // step2:Register driver
		DriverManager.registerDriver(dbDriver);
		
		//step3: Establish the database connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc831","root","root");
		
		//step4:create statement
	     Statement statement =connection.createStatement();
	     
	     //Step5: Execute Query to fetch data
	     ResultSet resultset= statement.executeQuery(" Select * from employee;");
	     while(resultset.next()) {
	    	 System.out.println((resultset.getInt("empID")+"\t"+resultset.getString("name")));
	     }
	     
	     //step6: close the connection
	     connection.close();		
		
	}
	

}
