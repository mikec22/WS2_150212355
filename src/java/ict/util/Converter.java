/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ict.util;

/**
 *
 * @author a1
 */
public class Converter {

    public double toFahrenheit(double v) {
        double f = 32 + 9 * v / 5;
        return f;
    }

    public double toCelsius(double v) {
        double c = (v - 32) * 5 / 9;
        return c;
    }
}
