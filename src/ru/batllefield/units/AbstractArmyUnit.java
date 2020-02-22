package ru.batllefield.units;

/**
 * Абстрактный класс - общий родитель для всех боевых единиц.
 */
public abstract class AbstractArmyUnit {
    private short health;

    protected AbstractArmyUnit(short health) {
        this.health = health;
    }

    protected AbstractArmyUnit() {
    }

    public short getHealth() {
        return health;
    }

}
