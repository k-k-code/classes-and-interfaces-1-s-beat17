package ru.batllefield.units;

/**
 * Абстрактный класс - общий родитель для всех боевых единиц.
 */
public abstract class AbstractArmyUnit {
    private short health;

    public AbstractArmyUnit(short health) {
        this.health = health;
    }

    public AbstractArmyUnit() {

    }

    public short getHealth() {
        return health;
    }
}
