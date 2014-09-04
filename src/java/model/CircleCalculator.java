/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author jrheingans1
 */
public class CircleCalculator {
    double pi = 3.14;
    
    public double calculateCircleArea(double radius) {
        double totalCircleArea = (pi * (radius *radius));
        return totalCircleArea;
    }
}
