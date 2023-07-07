package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ModifyDatabase {
	public static void main(String[] args) throws SQLException {
		// step1: create an instance of JDBC driver
		Driver dbDriver =new Driver();
		
		 // step2:Register driver
		DriverManager.registerDriver(dbDriver);
		
		//step3: Establish the database connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc831","root","root");
		
		//step4:create statement
	     Statement statement =connection.createStatement();
	     
	     //Step5:nExecute update Query
	     int result = statement.executeUpdate("insert into employee(empID,name,salary) values(111,'MBH',2500);");
	     System.out.println(result);
	      //Step6:Close connection
	     connection.close();
	     
	}
	

}
