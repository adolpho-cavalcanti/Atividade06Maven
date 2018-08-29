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
public class MediaTest {
    
    @Test
    public void testMedia() {
        double[] v = {1,2,3,4,5,6,7};
        Media m = new Media();
        double res = m.getMedia(v);
        assertEquals(4.0, res, 0.01);
        
    }

    @Test
    public void testMaiorNum() {
        double[] v = {1,2,3,4,5,6,7};
        MaiorNum maior = new MaiorNum();
        double res = maior.getMaiorNum(v);
        assertEquals(7.0, res, 0.01);
        
    }

    @Test
    public void testMenorNum() {
        double[] v = {1,2,3,4,5,6,7};
        MenorNum menor = new MenorNum();
        double res = menor.getMenorNum(v);
        assertEquals(1.0, res, 0.01);
        
    }

    @Test
    public void testAcimaMedia() {
        int[] v = {1,2,3,4,5,6,7};
        AcimaMedia acima = new AcimaMedia();
        int res = acima.getAcimaMedia(v);
        assertEquals(3, res, 0.01);
        
    }

    @Test
    public void testAbaixoMedia() {
        int[] v = {1,2,3,4,5,6,7};
        AbaixoMedia abaixo = new AbaixoMedia();
        int res = abaixo.getAbaixoMedia(v);
        assertEquals(3, res, 0.01);
        
    }
    
}
