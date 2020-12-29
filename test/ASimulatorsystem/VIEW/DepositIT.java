/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASimulatorsystem.VIEW;

import ASimulatorSystem.Deposit;
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
public class DepositIT {
    Deposit D;
    
@Before
    public void setUp() {
        D= new Deposit();
    }

 
    @Test
    public void depos() {
        assertEquals(500,D.depos(300, 200));
        System.out.println("Successfully Deposited");
    }  
}