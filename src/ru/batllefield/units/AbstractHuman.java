package ru.batllefield.units;

/**
 * Абстрактный класс - родительский класс для солдат.
 */
public abstract class AbstractHuman extends AbstractArmyUnit{

    /**
     * Уровень здоровья.
     */
    private short health;
    /**
     * Уровень брони.
     */
    private short armor;

    /**
     * Конструктор.
     * @param health уровень здоровья.
     * @param armor уровень брони.
     */
    protected AbstractHuman(short health, short armor) {
        this.armor = armor;
        this.health = health;
    }

    /**
     * Геттер для поля health.
     * @return уровень здоровья.
     */
    public short getHealth() {
        return health;
    }

    /**
     * Сеттер для поля health.
     * @param health уровень здоровья.
     */
    public void setHealth(short health) {
        this.health = health;
    }

    /**
     * Геттер для поля health.
     * @return уровень здоровья.
     */
    public short getArmor() {
        return armor;
    }

    /**
     * Переопределенный метод класса Object.
     * @return текстовое представление объекта.
     */
    @Override
    public String toString() {
        return "AbstractHuman{" +
                "health=" + health +
                ", armor=" + armor +
                '}';
    }
}
