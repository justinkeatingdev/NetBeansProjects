/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networksetup;

import NetworkSetup.networksetup;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import static org.junit.Assert.assertEquals;

@RunWith(Suite.class)

@Suite.SuiteClasses({ 
   networksetup.class 
})
public class networksetupTest {

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        networksetup.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
