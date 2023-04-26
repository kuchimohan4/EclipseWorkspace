package com.webapp;

public class passwordvalidatior {
	public boolean validatepassword(String uname,String password) {
		if(uname.equals("kuchi") && password.equals("mohan")) {
			return true;
		}
		else {
			return false;
		}
	}

}
