/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author James
 */
public class GeometricCalculator {

    private final double pi = 3.14;

    //circle calculations
    public double calculateCircleArea(double radius) {
        double totalArea = (pi * (radius * radius));
        return totalArea;
    }

    //rectangle calculations
    public double calculateRectangleArea(double length, double width) {
        double totalArea = length * width;
        return totalArea;
    }

    //triangle calculations
    public double calculateTriangleArea(double sideA, double sideB) {
        double totalArea = ((sideA * sideA) + (sideB * sideB));
        return Math.sqrt(totalArea);
    }
}
