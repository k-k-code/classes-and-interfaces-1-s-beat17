package ru.batllefield.units;

public class Tank extends AbstractMachine implements Shooter, Shootable {

    /**
     * Сила выстрела.
     */
    private short shootPower;

    /**
     * Уровень брони.
     */
    private short armor;

    /**
     * Конструктор.
     *
     * @param fuel остаток топлива.
     */
    public Tank(short fuel, short armor, short shootPower, Ranks rank) {
        super(fuel, rank);
        this.shootPower = shootPower; // установка значения силы выстрела.
        this.armor = armor; // устанавливаем значение уровня брони.
    }

    @Override
    public void shoot(Shootable target) {
        target.getShot(shootPower);
    }

    @Override
    public void getShot(short shootPower) {
        short fuel = getFuel();

        if (armor == 0) {
            setFuel((short) (fuel - shootPower));
        } else {
            setFuel((short) (fuel - shootPower / armor));
        }
    }
}
