/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASimulatorsystem.VIEW;

import ASimulatorSystem.Transcations;
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
public class TranscationsIT {
    Transcations T;
    
    @Before
    public void setUp() {
        T= new Transcations();
    }

 
    @Test
    public void trant() {
        assertEquals(0,T.trant(200, 200));
        System.out.println("Transaction Successful");
    }  
}