/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASimulatorsystem.CONTROLLER;

import ASimulatorSystem.Pin;
import ASimulatorSystem.Transcations;
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
public class PinT {
    
    Pin P;
    
    @Before
    public void setUp() {
        P= new Pin();
    }

 
    @Test
    public void changePin() {
        assertEquals(1234,P.changePin(4321, 1234));
        System.out.println("Pin chnaged");
    }  
}