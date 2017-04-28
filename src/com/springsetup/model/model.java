/**
 * 
 */
package com.springsetup.model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springsetup.dbproperties.GetSetParamaters;

/**
 * @author PRATIK SHAH
 *
 */
public class model {

	public void connecttoDB()
	
	{
		
		ClassPathXmlApplicationContext contextval = new ClassPathXmlApplicationContext("spring.xml");
		GetSetParamaters getsetparams = (GetSetParamaters)contextval.getBean("GetSetParamaters");
		String username=getsetparams.getUsername();
		
		
	}
}
