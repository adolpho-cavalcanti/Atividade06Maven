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
public class MaiorNumTest {
    
        @Test
    public void testMaiorNum() {
        int[] v = {1,2,3,4,5,6,7};
        MaiorNum maior = new MaiorNum();
        int res = maior.getMaiorNum(v);
        assertEquals(7.0, res, 0.01);
        
    }

}
