/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testforgit;

/**
 *
 * @author El-Greatly
 */
public class division {
    float divisionMethod(float a,float b)
    {
        float result = 0;
        if (b == 0)
        {
            System.out.println("/zero not allowed");
        }
        else
        {
            result = a/b;
        }
        return result;
    }
    
}
