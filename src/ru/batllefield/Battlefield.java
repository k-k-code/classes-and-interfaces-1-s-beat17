package ru.batllefield;

import ru.batllefield.units.AbstractArmyUnit;
import ru.batllefield.units.Shooter;
import ru.batllefield.units.Soldier;
import ru.batllefield.units.Transport;

/**
 * Главный класс, содержащий метод main
 */
public class Battlefield {

    public static short sShootPower = 12;
    public static short sHealth = 50;
    public static  short sArmor = 2;

    /**
     * Главный метод приложения - точка входа (запуска).
     * @param args аргументы, которые передаются при запуске приложения.
     */
    public static void main(String[] args) {
        Soldier soldier1 = new Soldier(sShootPower, sHealth, sArmor);
        Soldier soldier2 = new Soldier(sShootPower, sHealth, sArmor);
        Transport transport = new Transport((short) 4, (short) 80);

        soldier1.shoot(soldier2);
        soldier1.shoot(transport);

        System.out.println(soldier1.toString());
        System.out.println(soldier2.toString());
        System.out.println(transport.toString());


        AbstractArmyUnit[] army1 = new AbstractArmyUnit[4];
        army1[0] = new Soldier(sShootPower, sHealth, sArmor);
        army1[1] = new Transport((short) 4, (short) 80);
        army1[2] = new Soldier(sShootPower, sHealth, sArmor);
        army1[3] = new Transport((short) 4, (short) 80);

        Transport enemy = new Transport((short) 4, (short) 80);

        for (int i = 0; i < 4; i++) { //все делают 4 выстрела

            for(int j = 0; j < army1.length; j++) { //каждый из армии
                if(army1[j] instanceof Shooter) { // если стрелок
                    Shooter shooter = (Shooter) army1[j]; // приводим тип
                    shooter.shoot(enemy); // стреляем
                }
            }

        }

        System.out.println(enemy.toString());

    }

}
