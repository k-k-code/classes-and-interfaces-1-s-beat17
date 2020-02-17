package ru.batllefield.units;

/**
 * Абстрактный класс - родительский класс для техники.
 */
public class AbstractMachine  extends AbstractArmyUnit {

    /**
     * Остаток топлива.
     */
    private short fuel;

    /**
     * Конструктор.
     * @param fuel остаток топлива.
     */
    protected AbstractMachine(short fuel) {
        this.fuel = fuel;
    }

    /**
     * Геттер для поля fuel.
     * @return остаток топлива.
     */
    protected short getFuel() {
        return fuel;
    }

    /**
     * Сеттер для поля fuel.
     * @param fuel остаток топлива.
     */
    protected void setFuel(short fuel) {
        this.fuel = fuel;
    }

    /**
     * Переопределенный метод класса Object.
     * @return текстовое представление объекта.
     */
    @Override
    public String toString() {
        return "AbstractMachine{" +
                "fuel=" + fuel +
                '}';
    }
}
