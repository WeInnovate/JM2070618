package com.jm2070618.learn.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyRequestLifeCycleListener
 *
 */
@WebListener
public class MyRequestLifeCycleListener implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public MyRequestLifeCycleListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
        System.out.println("requestDestroyed");
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
    	 System.out.println("requestInitialized");
    }
	
}
