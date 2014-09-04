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
public class TriangleCalculator {
    public double calculateTriangleArea(double sideA, double sideB) {
        double totalTriangleArea = ((sideA * sideA) + (sideB * sideB));
        return Math.sqrt(totalTriangleArea);
    }
}
