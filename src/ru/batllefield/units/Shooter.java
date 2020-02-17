package ru.batllefield.units;

/**
 * Интерфнйс определяет поведение стрелка.
 */
public interface Shooter {

    /**
     * Выстрел по цели.
     * @param target цель.
     */
    void shoot(Shootable target);

}
