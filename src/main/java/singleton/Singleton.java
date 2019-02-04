package singleton;

import java.util.logging.Logger;

public class Singleton {

	  // private instance, so that it can be 
	  // accessed by only by getInstance() method 
	  private static Singleton instance; 
	  
	  /* A private Constructor prevents any other
	    * class from instantiating.
	    */
	  private Singleton()  {}
	
	  
	 //synchronized method to control simultaneous access 
	  synchronized public static Singleton getInstance()  
	  { 
	    if (instance == null)  
	    { 
	      // if instance is null, initialize 
	      instance = new Singleton(); 
	    } 
	    return instance; 
	  } 
	  
	  public Logger logger() {
		  final Logger logger = Logger.getLogger(Singleton.class.getName());
		  System.out.println("Creating new instance");
		  return logger;
	  }
	  
	} 

