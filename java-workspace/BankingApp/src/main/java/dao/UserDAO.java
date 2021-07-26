package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.Scanner;
import common.pojo.Customer;
import common.util.DBUtil;

public class UserDAO {

	
	
	public void register() throws Exception/* throws CustomerAlreadyExistsException */ {
		
		try(Connection dbaccess = DBUtil.getInstance().getConnection()){
			try(Scanner scan = new Scanner(System.in)) {
				System.out.println("Please enter your first name");
				String first_name = scan.next();
				System.out.println("Please enter your last name");
				String last_name = scan.next();
				System.out.println("Please enter your email address");
				String email = scan.next();
				System.out.println("Please enter your date of birth in the format yyyy-mm-dd");
				String dob = scan.next();
				Date date = Date.valueOf(dob);
				System.out.println("Please enter a username to login with");
				String username = scan.next();
				System.out.println("Please enter your password");
				String password = scan.next();
				
				
				PreparedStatement insert = dbaccess.prepareStatement("insert into bankdb.customer (first_name,last_name,email,dob,username,pass) values (?,?,?,?,?,?);");
				
				insert.setString(1, first_name);
				insert.setString(2, last_name);
				insert.setString(3, email);
				insert.setDate(4, date);
				insert.setString(5, username);
				insert.setString(6, password);
				
				int inserted = insert.executeUpdate();
				
				if(inserted == 1) {
					System.out.println("Your account was successfully created. You may now login with your username and password.");
				}else {
					System.out.println("There was an error creating your account. Please try another username.");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}catch (SQLException e) {
			
		}
		
	}
	
	
	public Customer login() {
		return null;
	}
	
}

/* try(Connection dbaccess = DBUtil.getInstance().getConnection()) {
			
			String query = "select * from bankdb.customer";
			PreparedStatement pstmt = dbaccess.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Customer c = new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				System.out.println("id: "+c.getId()+" || name:"+c.getFirst_name()+" "+c.getLast_name()+" || email: "+c.getEmail()+" || Date of Birth: "+c.getDob()+" || username: "+c.getUsername()+" || Password "+c.getPassword());
			}
		
		}catch (SQLException e){
			
		}
 */ 
