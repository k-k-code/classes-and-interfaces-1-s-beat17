package ru.batllefield;

import ru.batllefield.units.*;

/**
 * Главный класс, содержащий метод main
 */
public class Battlefield {

    public static short sShootPower = 12;
    public static short sHealth = 50;
    public static short sArmor = 2;
    public static short sFuel = 80;

    /**
     * Главный метод приложения - точка входа (запуска).
     *
     * @param args аргументы, которые передаются при запуске приложения.
     */
    public static void main(String[] args) {

        AbstractArmyUnit[] army1 = new AbstractArmyUnit[4];
        buildArmyArray(army1);

        AbstractArmyUnit[] army2 = new AbstractArmyUnit[4];
        buildArmyArray(army2);

        attackArmy(army1, army2);
        attackArmy(army2, army1);

        printArmy(army2);
        System.out.println("=================================");
        printArmy(army1);
    }

    private static void buildArmyArray(AbstractArmyUnit armyArray[]) {
        armyArray[0] = new Soldier(sHealth, sArmor, sShootPower, Ranks.PRIVATE);
        armyArray[1] = new Transport(sFuel, sArmor, Ranks.SERGEANT);
        armyArray[2] = new Medic(sHealth, sArmor, Ranks.LEUTENANT);
        armyArray[3] = new Tank(sFuel, sArmor, sShootPower, Ranks.GENERAL);
    }

    private static void printArmy(AbstractArmyUnit army[]) {
        for (int i = 0; i < army.length; i++) {
            System.out.println(army[i].toString());
        }
    }

    private static void attackArmy(AbstractArmyUnit army1[], AbstractArmyUnit army2[]) {
        for (int i = 0; i < army1.length; i++) {
            if(army1[i] instanceof Shooter) {
                for (int j = 0; j < army2.length; j++) { //каждый из армии
                    if (army2[j] instanceof Shootable) { // если стрелок
                        Shooter shooter = (Shooter) army1[j]; // приводим тип
                        shooter.shoot((Shootable) army2[i]); // стреляем
                        System.out.println(army2[i].getHealth());
                    }
                }
            }
        }

    }

}
