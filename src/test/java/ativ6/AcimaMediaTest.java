/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativ6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author acn20
 */
public class AcimaMediaTest {
    
    @Test
    public void testAcimaMedia() {
        int[] v = {1,2,3,4,5,6,7};
        AcimaMedia acima = new AcimaMedia();
        int res = acima.getAcimaMedia(v);
        assertEquals(3, res, 0.01);
        
    }

}
