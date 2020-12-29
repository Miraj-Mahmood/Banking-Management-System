/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASimulatorsystem.VIEW;

import ASimulatorSystem.Withdrawl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

//import aSimulatorSystem.Withdrawl;

/**
 *
 * @author Miraj
 */
public class WithdrawlTest {
	
    Withdrawl W;
    @Before
    public void setUp() {
        W= new Withdrawl();
    }

 
    @Test
    public void testWithD() {
        assertEquals(0,W.withD(200, 200));
        System.out.println("Withdraw Successful");
    }  
}