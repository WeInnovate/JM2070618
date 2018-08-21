package com.jm2070618.learn.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class
 * MyRequestAttributeListener
 *
 */
@WebListener
public class MyRequestAttributeListener implements ServletRequestAttributeListener {

	/**
	 * Default constructor.
	 */
	public MyRequestAttributeListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
	 */
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("attributeRemoved " + srae.getName() + " " + srae.getValue());
	}

	/**
	 * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
	 */
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("attributeAdded " + srae.getName() + " " + srae.getValue());
	}

	/**
	 * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
	 */
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println("attributeReplaced " + srae.getName() + " " + srae.getValue());
	}

}
