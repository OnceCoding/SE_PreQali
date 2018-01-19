/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_preqali;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import static se_preqali.HEIGHT.height;

/**
 *
 * @author javierfuenteshuertas
 */
public class WEIGHT {
    public static final Map<Float, Float> weight;
    static {
        Map<Float, Float> mapWeight = new HashMap<Float, Float>();
        mapWeight.put(0.083f, 4.0f);
        mapWeight.put(0.166f, 5.0f);
        mapWeight.put(0.25f, 6.0f);
        mapWeight.put(0.333f, 6.0f);
        mapWeight.put(0.416f, 7.0f);
        mapWeight.put(0.5f, 7.0f);
        mapWeight.put(0.583f, 8.0f);
        mapWeight.put(0.666f, 8.0f);
        mapWeight.put(0.750f, 9.0f);
        mapWeight.put(0.833f, 9.0f);
        mapWeight.put(0.916f, 9.0f);
        mapWeight.put(1.0f, 10.0f);
        mapWeight.put(1.25f, 10.0f);
        mapWeight.put(1.5f, 11.0f);
        mapWeight.put(1.75f, 12.0f);
        mapWeight.put(2.0f, 12.0f);
        mapWeight.put(2.5f, 13.0f);
        mapWeight.put(3.0f, 14.0f);
        mapWeight.put(3.5f, 15.0f);
        mapWeight.put(4.0f, 16.0f);
        mapWeight.put(4.5f, 17.0f);
        mapWeight.put(5.0f, 20.0f);
        mapWeight.put(6.0f, 21.0f);
        mapWeight.put(7.0f, 24.0f);
        mapWeight.put(8.0f, 26.0f);
        mapWeight.put(9.0f, 28.0f);
        mapWeight.put(10.0f, 32.0f);
        mapWeight.put(11.0f, 35.0f);
        mapWeight.put(12.0f, 38.0f);
        weight = Collections.unmodifiableMap(mapWeight);
    }
}
