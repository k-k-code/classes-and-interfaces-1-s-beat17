package ru.batllefield.units;

/**
 * Солдат - класс, описывающий солдата, является наследником AbstractHuman и реализует интерфейсы Shooter и Shootable.
 */
public class Soldier extends AbstractHuman implements Shooter, Shootable {

    /**
     * Сила выстрела.
     */
    private short shootPower;

    /**
     * Конструктор.
     * @param shootPower сила выстрела.
     * @param health уровень здоровья.
     * @param armor уровень брони.
     */
    public Soldier(short shootPower, short health, short armor) {
        super(health, armor); // вызов конструктора родителя.
        this.shootPower = shootPower; // установка значения силы выстрела.
    }

    /**
     * Переопределенный метод интерфейса Shootable.
     * @param shootPower сила выстрела.
     */
    @Override
    public void getShot(short shootPower) {
        short armor = getArmor();
        short health = getHealth();

        if (armor == 0) {
            setHealth((short) (health - shootPower));
        } else {
            setHealth((short) (health - shootPower / armor));
        }
    }

    /**
     * Переопределенный метод интерфейса Shooter.
     * @param target цель.
     */
    @Override
    public void shoot(Shootable target) {
        target.getShot(shootPower);
    }
}
