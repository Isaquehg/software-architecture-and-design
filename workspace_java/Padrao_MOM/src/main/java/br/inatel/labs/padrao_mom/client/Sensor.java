package br.inatel.labs.padrao_mom.client;

import java.util.Random;

/**
 * @author isaquehg
 * @since 4/12/23
 * @version 1.0
 * Sensor object with reading buitl-in methods
 */
public class Sensor {
    public double readTemp(){
        return new Random().
                doubles(-40, 80).
                findAny().
                getAsDouble();
    }

    public double readVoltage(){
        return new Random().
                doubles(0, 380).
                findAny().
                getAsDouble();
    }

    public double readCurrent(){
        return new Random().
                doubles(0, 60).
                findAny().
                getAsDouble();
    }
}
