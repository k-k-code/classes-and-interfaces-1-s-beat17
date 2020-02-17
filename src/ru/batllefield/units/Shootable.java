package ru.batllefield.units;

/**
 * Интерфейс определяющий поведение цели.
 */
public interface Shootable {

    /**
     * Метод обрабатывает попадание.
     * @param shootPower сила выстрела.
     */
    void getShot(short shootPower);

}
