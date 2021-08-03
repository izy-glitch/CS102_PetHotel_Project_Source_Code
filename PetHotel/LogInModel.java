package PetHotel;

/*
 * this is the model class of the log-in page
 * 
 * @author Alper Bi�er
 */

public class LogInModel {

	// objects
	LogInController controller;
	// variables
	String email, password;
	
	/**
	 * contructor
	 */
	public LogInModel( LogInView view ) {
		controller = new LogInController( view );
	}
}
