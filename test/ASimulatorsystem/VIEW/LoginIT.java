/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASimulatorsystem.VIEW;

import ASimulatorSystem.Login;
import ASimulatorSystem.Withdrawl;
import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Miraj
 */
public class LoginIT {
    
 Login L;
    @Before
    public void setUp() {
        L= new Login();
    }

 
    @Test
    public void login() {
        assertEquals("successful",L.login("miraj", "1234"));
        System.out.println("Login Successful");
    }  
}
