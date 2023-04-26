

package com.kuchi.spring;
//import org.springframework.beans.factory.xml.XmlBeanFactory;//not working because its degraded
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.PlaceholderConfigurerSupport;


public class veding_application {
	public static void main(String[] args) {
//		coffie coffie=new coffie();
		
//		BeanFactory factory=new XmlBeanFactory("xmlflie")
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		item itm=(item) context.getBean("jucemenu");
		itm.displayMenu();
//		coffie.brue();
	//xml file should be in class path
		
	}

}
