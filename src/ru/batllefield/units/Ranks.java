package ru.batllefield.units;

public enum Ranks {

    PRIVATE(1.05),
    SERGEANT(1.07),
    LEUTENANT(1.09),
    CAPTAIN(1.13),
    GENERAL(1.20),
    MARSHAL(2);

    Ranks(double multiplier) {
        this.multiplier = multiplier;
    }

    private double multiplier;

    public double getMultiplier() {
        return multiplier;
    }
}
