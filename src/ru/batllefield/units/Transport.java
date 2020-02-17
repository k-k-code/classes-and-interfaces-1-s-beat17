package ru.batllefield.units;

/**
 * Транспорт - класс, описывающий транспорт, является наследником AbstractMachine и реализует интерфейс Shootable.
 */
public class Transport extends AbstractMachine implements Shootable {

    /**
     * Уровень брони.
     */
    private short armor;

    /**
     * Конструктор.
     * @param armor уровень брони.
     * @param fuel остаток топлива.
     */
    public Transport(short armor, short fuel) {
        super(fuel); // вызываем конструктор родительского класса.
        this.armor = armor; // устанавливаем значение уровня брони.
    }

    /**
     * Переопределенный метод интерфейса Shootable.
     * @param shootPower сила выстрела.
     */
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
