/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASimulatorsystem.MODEL;


import ASimulatorSystem.conn;
import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

/**
 *
 * @author Miraj
 */
public class connIT {
    conn instance;
    
    public connIT() {
    }
    
    @BeforeClass
    public void setUpClass() {
        instance =Mockito.mock(conn.class);
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
         System.out.println("testing conn object");
         ActionEvent e =new  ActionEvent(instance, ActionEvent.ACTION_PERFORMED, "command");
          Mockito.verify(instance);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
