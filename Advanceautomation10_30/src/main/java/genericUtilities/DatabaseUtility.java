package genericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Driver;


public class DatabaseUtility implements IAutoConstants{
	Driver dbdriver;
	Connection connection;
	Statement statement;
	ResultSet result;
/**
 * This method is used to connect the database
 */
	public void establishingDBConnections() {
		try {
			dbdriver= new Driver();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			DriverManager.registerDriver(dbdriver);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			connection=DriverManager.getConnection(DATABASE_URL,DATABASE_UN,DATABASE_PWD);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}


	}
	/**
	 * This method is used to read data from database
	 */

	public ArrayList readingDataFromDataBase(String query,String columnName) {
		ArrayList list=new ArrayList();
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		try {
			result=statement.executeQuery(query);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		try {
			while(result.next()) {
				try {
					list.add(result.getString(columnName));
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println(list);
		return list;
	}
	public void closingDBconnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
}
