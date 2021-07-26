package manager;

import java.util.List;

import client.ConsoleApp;
import common.pojo.Customer;
import dao.UserDAO;

public class UserMgr {
	
	UserDAO dao = new UserDAO();

	public void register()/* throws CustomerAlreadyExistsException */ {
		try {
			dao.register();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void login() {
		try {
			dao.login();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
