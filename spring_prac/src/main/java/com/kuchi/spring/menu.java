package com.kuchi.spring;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
//implements ApplicationContextAware,BeanNameAware, implements InitializingBean,DisposableBean
public class menu implements InitializingBean,DisposableBean,item{
	private List<coffie> lst;
	private ApplicationContext context;
	private coffie cc;
	private coffie hc;
	private coffie nc;


	
	
	public ApplicationContext getContext() {
		return context;
	}


	public void setContext(ApplicationContext context) {
		this.context = context;
	}


	public coffie getCc() {
		return cc;
	}


	public void setCc(coffie cc) {
		this.cc = cc;
	}


	public coffie getHc() {
		return hc;
	}


	public void setHc(coffie hc) {
		this.hc = hc;
	}


	public coffie getNc() {
		return nc;
	}


	public void setNc(coffie nc) {
		this.nc = nc;
	}
	
//	public menu(coffie cc, coffie hc, coffie nc) {
//	super();
//	this.cc = cc;
//	this.hc = hc;
//	this.nc = nc;
//}


	public List<coffie> getLst() {
		return lst;
	}


	public void setLst(List<coffie> lst) {
		this.lst = lst;
	}


	public void displayMenu() {
//		for (coffie cc : lst) {
//			System.out.println(cc.getPrice()+" $ for "+cc.getType()+" coffie.");
//			
			
//		}
		
		System.out.println(cc.getPrice()+" $ for "+cc.getType()+" coffie.");
		System.out.println(hc.getPrice()+" $ for "+hc.getType()+" coffie.");
		System.out.println(nc.getPrice()+" $ for "+nc.getType()+" coffie.");
	}

//	public List<coffie> getLst() {
//		return lst;
//	}
//
//	public void setLst(List<coffie> lst) {
//		this.lst = lst;
//	}

//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		this.context=applicationContext;
//		
//	}
//
//	public void setBeanName(String name) {
//		System.out.println("bean name is:"+name);
//		
//	}


	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("beans initialized");
	}


	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("beans destroied");
		
	}
	public void myinit() {
		System.out.println("init method called");
	}
	public void mycleanup() {
		System.out.println("cleanup method called");
	}
	

}
