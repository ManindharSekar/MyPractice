package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class EmpDao {
	
	public int save(int id,String name,String email,float salary) throws SQLException{
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empcrud_da","root","Mani123");
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3,email);
		ps.setFloat(4, salary);
		int i = ps.executeUpdate();
		return i;
		
	}

}
