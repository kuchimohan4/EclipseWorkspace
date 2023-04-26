package com.login;

import java.beans.PropertyEditorSupport;

public class nameeditor extends PropertyEditorSupport {
	
	
	@Override
	public void setAsText(String name) throws IllegalArgumentException {
		
		if(name.contains("mr.")|| name.contains("ms.")) {
			setValue(name);
		}
		else {
			setValue("ms."+name);
		}
		
	}
	

}
