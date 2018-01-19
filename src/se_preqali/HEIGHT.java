/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_preqali;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author javierfuenteshuertas
 */
public class HEIGHT {
    public static final Map<Float, Float> height;
    static {
        Map<Float, Float> mapHeight = new HashMap<Float, Float>();
        mapHeight.put(0.083f, 0.54f);
        mapHeight.put(0.166f, 0.57f);
        mapHeight.put(0.250f, 0.61f);
        mapHeight.put(0.333f, 0.63f);
        mapHeight.put(0.416f, 0.66f);
        mapHeight.put(0.500f, 0.67f);
        mapHeight.put(0.583f, 0.69f);
        mapHeight.put(0.666f, 0.70f);
        mapHeight.put(0.750f, 0.72f);
        mapHeight.put(0.833f, 0.73f);
        mapHeight.put(0.916f, 0.74f);
        mapHeight.put(1.000f, 0.76f);
        mapHeight.put(1.250f, 0.79f);
        mapHeight.put(1.500f, 0.82f);
        mapHeight.put(1.750f, 0.84f);
        mapHeight.put(2.000f, 0.87f);
        mapHeight.put(2.500f, 0.92f);
        mapHeight.put(3.000f, 0.96f);
        mapHeight.put(3.500f, 0.99f);
        mapHeight.put(4.000f, 1.02f);
        mapHeight.put(4.500f, 1.06f);
        mapHeight.put(5.000f, 1.09f);
        mapHeight.put(6.000f, 1.13f);
        mapHeight.put(7.000f, 1.18f);
        mapHeight.put(8.000f, 1.23f);
        mapHeight.put(9.000f, 1.28f);
        mapHeight.put(10.000f, 1.33f);
        mapHeight.put(11.000f, 1.38f);
        mapHeight.put(12.000f, 1.38f);
        height = Collections.unmodifiableMap(mapHeight);
    }
}
