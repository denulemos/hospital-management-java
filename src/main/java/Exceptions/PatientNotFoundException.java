/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author Denu
 */
public class PatientNotFoundException extends Exception{
    public PatientNotFoundException (String id) {
		super("This patient does not exist: " + id);
	}
    
}
