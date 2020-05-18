package com.company.person;

import com.company.transport.AirTransport;
import com.company.transport.LandTransport;
import com.company.transport.SeaTransport;

/**
 * @description:
 * @author: 邓建军
 * @date: Created in 2020/5/18 16:28
 * @version: 1.0
 * @modified By:
 */
public class Person {
    private int p_Age = 19;
    private String p_Sex = "男";
    private String id = "201902187";
    private String p_Name;

    public Person(String p_Name) {
        this.p_Name = p_Name;
    }

    public Person() {
    }

    public void driveTransport(AirTransport transport) {
        transport.drivingMethod(transport);
    }
    public void driveTransport(LandTransport transport) {
        transport.drivingMethod(transport);
    }
    public void driveTransport(SeaTransport transport) {
        transport.drivingMethod(transport);
    }
}
