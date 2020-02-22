package ru.batllefield.units;

/**
 * Абстрактный класс - общий родитель для всех боевых единиц.
 */
public abstract class AbstractArmyUnit {
    private short health;
    protected Ranks rank;

    protected AbstractArmyUnit(short health, Ranks rank) {
        this(rank);
        this.health = health;
    }

    protected AbstractArmyUnit(Ranks rank) {
        this.rank = rank;
    }

    public short getHealth() {
        return health;
    }

}
