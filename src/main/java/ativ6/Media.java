/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativ6;

import java.util.Scanner;
import java.util.Scanner;
/**
 *
 * @author acn20
 */
public class Media {

    int getMedia(int[] v) {
        int v[] = new int[7];
        int i;
        int soma = 0;
        double media = 0;
                
        for(i = 0; i < 7; i++) {
            soma = soma + i;
        }
        
        media = soma/7;
        return (int) media;
        
    }
}
