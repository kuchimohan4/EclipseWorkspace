package com.mohan.webapp;

import org.springframework.stereotype.Service;

@Service
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
