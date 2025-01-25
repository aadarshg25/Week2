package com.tit.week2.day05.singleinheritence.smarthomehierarchy;

class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("T123", "Active", 22.5);
        thermostat.displayStatus();
    }
}
